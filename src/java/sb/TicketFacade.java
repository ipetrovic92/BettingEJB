/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.BettingUser;
import domain.Ticket;
import domain.TicketMatch;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Ivan
 */
@Stateless
public class TicketFacade extends AbstractFacade<Ticket> implements TicketFacadeLocal {

    @PersistenceContext(unitName = "BettingEJBPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TicketFacade() {
        super(Ticket.class);
    }

    @Override
    public List<Ticket> getUserTickets(BettingUser bettingUser) {
        Query ticketQuery = em.createNamedQuery("Ticket.findByEmailUser");
        return ticketQuery.setParameter("emailUser", bettingUser.getEmail()).getResultList();
    }

    @Override
    public String getNewTicketId() {
        List<Ticket> resultList = em.createNamedQuery("Ticket.findLatestPlayedTickets").getResultList();

        if (resultList == null || resultList.isEmpty()) {
            return "1";
        }

        int maxId = -1;
        for (Ticket t : resultList) {
            int ticketId = Integer.parseInt(t.getTicketPK().getId());
            if (ticketId > maxId) {
                maxId = ticketId;
            }
        }
        return (maxId + 1) + "";
    }

    @Override
    public void saveTicket(Ticket t) throws Exception{
        Query userQuery = em.createNamedQuery("Ticket.findByEmailUserAndId");
        userQuery.setParameter("emailUser", t.getTicketPK().getEmailUser());
        List<Ticket> userList = userQuery.setParameter("id", t.getTicketPK().getId()).getResultList();
        
        if (!userList.isEmpty()) {
            throw new Exception("Exception_TicketAlreadyExist");
        }
        if(t.getStake() < 30.0){
            throw new Exception("Exception_TicketStakeIsLessThanMin");
        }
        
        if(t.getTicketMatchList().isEmpty()){
            throw new Exception("Exception_NoGameOnTheTicket");
        }
        
        for (TicketMatch ticketMatch : t.getTicketMatchList()) {
            if(ticketMatch.getGame().getGameTime().compareTo(t.getPaymentTime()) < 0){
                throw new Exception("Exception_SomeOfTheGamesAlreadyStarted");
            }
        }
        super.create(t);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sb;

import domain.Ticket;
import domain.TicketMatch;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Ivan
 */
@Stateless
public class TicketMatchFacade extends AbstractFacade<TicketMatch> implements TicketMatchFacadeLocal {
    @PersistenceContext(unitName = "BettingEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TicketMatchFacade() {
        super(TicketMatch.class);
    }
    
    @Override
    public List<TicketMatch> getAllTicketMatch(Ticket ticket) {
        
        Query ticketQuery = em.createNamedQuery("TicketMatch.findByEmailUserAndTicketId");
        ticketQuery.setParameter("emailUser", ticket.getTicketPK().getEmailUser());
        return ticketQuery.setParameter("ticketId", ticket.getTicketPK().getId()).getResultList();
    }
    
}

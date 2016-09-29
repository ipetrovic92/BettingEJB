/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.BettingUser;
import domain.Ticket;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ivan
 */
@Remote
public interface TicketFacadeLocal {

    void create(Ticket ticket);

    void edit(Ticket ticket);

    void remove(Ticket ticket);

    Ticket find(Object id);

    List<Ticket> findAll();

    List<Ticket> findRange(int[] range);

    int count();
    
    List<Ticket> getUserTickets(BettingUser bettingUser); 
    
    String getNewTicketId(); 
    
    void saveTicket(Ticket t) throws Exception;
}

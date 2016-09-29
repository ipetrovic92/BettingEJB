/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sb;

import domain.Game;
import domain.Ticket;
import domain.TicketMatch;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ivan
 */
@Remote
public interface TicketMatchFacadeLocal {

    void create(TicketMatch ticketMatch);

    void edit(TicketMatch ticketMatch);

    void remove(TicketMatch ticketMatch);

    TicketMatch find(Object id);

    List<TicketMatch> findAll();

    List<TicketMatch> findRange(int[] range);

    int count();
    
    List<TicketMatch> getAllTicketMatch(Ticket ticket);
}

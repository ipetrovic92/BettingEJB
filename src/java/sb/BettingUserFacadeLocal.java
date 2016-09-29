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
public interface BettingUserFacadeLocal {

    void create(BettingUser bettingUser);

    void edit(BettingUser bettingUser);

    void remove(BettingUser bettingUser);

    BettingUser find(Object id);

    List<BettingUser> findAll();

    List<BettingUser> findRange(int[] range);

    int count();
    
    BettingUser logIn(BettingUser u);
    
    void registerNewUser(BettingUser bettingUser) throws Exception;
}

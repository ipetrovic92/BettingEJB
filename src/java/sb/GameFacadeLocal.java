/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.Game;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ivan
 */
@Remote
public interface GameFacadeLocal {

    void create(Game game);

    void edit(Game game);

    void remove(Game game);

    Game find(Object id);

    List<Game> findAll();

    List<Game> findRange(int[] range);

    int count();
    
    List<Game> getGameStartingAfter(Date date); 
}

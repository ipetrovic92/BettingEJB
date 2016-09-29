/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.Game;
import java.util.Date;
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
public class GameFacade extends AbstractFacade<Game> implements GameFacadeLocal {

    @PersistenceContext(unitName = "BettingEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Game.class);
    }

    @Override
    public List<Game> getGameStartingAfter(Date date) {
        Query ticketQuery = em.createNamedQuery("Game.findGameStartingAfterTime");
        return ticketQuery.setParameter("gameTime", date).getResultList();
    }
    
    
}

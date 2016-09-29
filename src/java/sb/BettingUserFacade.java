/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.Administrator;
import domain.BettingUser;
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
public class BettingUserFacade extends AbstractFacade<BettingUser> implements BettingUserFacadeLocal {

    @PersistenceContext(unitName = "BettingEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BettingUserFacade() {
        super(BettingUser.class);
    }

    @Override
    public BettingUser logIn(BettingUser u) {
        Query userQuery = em.createNamedQuery("BettingUser.findByEmailAndPassword");
        userQuery.setParameter("email", u.getEmail());
        List<BettingUser> userList = userQuery.setParameter("password", u.getPassword()).getResultList();

        if (userList.isEmpty()) {
            return null;
        }
        return userList.get(0);
    }

    @Override
    public void registerNewUser(BettingUser entity) throws Exception {
        Query adminQuery = em.createNamedQuery("Administrator.findByEmail");
        List<Administrator> adminList = adminQuery.setParameter("email", entity.getEmail()).getResultList();
        if (!adminList.isEmpty()) {
            throw new Exception("Exception_AdministratorWithEmailExist");
        }

        Query userQuery = em.createNamedQuery("BettingUser.findByEmail");
        List<BettingUser> userList = userQuery.setParameter("email", entity.getEmail()).getResultList();
        if (!userList.isEmpty()) {
            throw new Exception("Exception_UserWithEmailExist");
        }
        super.create(entity);
    }
}

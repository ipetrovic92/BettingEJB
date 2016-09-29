/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import domain.Administrator;
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
public class AdministratorFacade extends AbstractFacade<Administrator> implements AdministratorFacadeLocal {

    @PersistenceContext(unitName = "BettingEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministratorFacade() {
        super(Administrator.class);
    }
    
    
    @Override
    public Administrator logIn(Administrator a){
        Query userQuery = em.createNamedQuery("Administrator.findByEmailAndPassword");
        userQuery.setParameter("email", a.getEmail());
        List<Administrator> adminList = userQuery.setParameter("password", a.getPassword()).getResultList();

        if (adminList.isEmpty()) {
            return null;
        }
        return adminList.get(0);
    }
    
}

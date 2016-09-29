/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sb;

import domain.Status;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ivan
 */
@Remote
public interface StatusFacadeLocal {

    void create(Status status);

    void edit(Status status);

    void remove(Status status);

    Status find(Object id);

    List<Status> findAll();

    List<Status> findRange(int[] range);

    int count();
    
}

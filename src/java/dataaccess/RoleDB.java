/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import javax.persistence.EntityManager;
import models.Role;

/**
 *
 * @author Hussein
 */
public class RoleDB {
    public Role get(int ID){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            Role role = em.find(Role.class, ID);
            return role;
            
        } finally {
            em.close();
        }

    }
}

package cl.cvasoft.backpaes.dao.impl;

import cl.cvasoft.backpaes.dao.UsersDAO;
import cl.cvasoft.backpaes.model.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UsersDAOImpl implements UsersDAO {
    private final EntityManager em;

    public UsersDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Users crearUsuario(Users user) {
        em.persist(user);
        return user;
    }
}

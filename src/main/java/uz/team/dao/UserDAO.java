package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.User;

import java.util.List;

public class UserDAO implements Dao<User> {
    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(Long id) {
        return null;
    }

    public User findByUsername(String username) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        User username1 = session.createQuery("select t from User  t where  t.username =:username", User.class)
                .setParameter("username", username)
                .getSingleResult();
        session.getTransaction().commit();
        return username1;
    }
}

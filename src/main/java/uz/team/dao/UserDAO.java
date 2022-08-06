package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.User;

import java.util.List;
import java.util.Optional;

public class UserDAO implements Dao<User>{
    @Override
    public User create(User entity) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
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

    public Optional<User> findByUsername(String username) {
        Session session = HibernateConfigurer.getSession();
        return Optional.ofNullable(
                session.createQuery("select  t from User t where t.username = :username", User.class)
                        .setParameter("username", username)
                        .getSingleResultOrNull());
    }
}

package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.User;
import uz.team.dto.user.RegisterDTO;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDAO implements Dao<User> {
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




    public User update(Long id1, User user) {
        String fullName = user.getFullName();
        String username = user.getUsername();
        String email = user.getEmail();
        Integer phoneNumber = user.getPhoneNumber();
        String password = user.getPassword();
        Session session = HibernateConfigurer.getSession();
         return (User) session.createQuery("update User set " +
                 "fullName = :fullname," +
                 "phoneNumber = :phoneNumber," +
                 "email = :email," +
                 "username = :username," +
                 "password =: password where id = :id1")
                 .setParameter(fullName,fullName)
                 .setParameter(username,username)
                 .setParameter(email,email)
                 .setParameter(phoneNumber,phoneNumber)
                 .setParameter(password,password)
                 .setParameter(Math.toIntExact(id1),id1).getSingleResultOrNull();
    }

    public Optional<User> findByUsername(String username) {
        Session session = HibernateConfigurer.getSession();
        return Optional.ofNullable(
                session.createQuery("select  t from User t where t.username = :username", User.class)
                        .setParameter("username", username)
                        .getSingleResultOrNull());
    }

    public User findByUsername1(String username) {
        Session session = HibernateConfigurer.getSession();
        return
                session.createQuery("select  t from User t where t.username = :username", User.class)
                        .setParameter("username", username)
                        .getSingleResultOrNull();
    }

    public User findById(int toIntExact) {
        Session session = HibernateConfigurer.getSession();
        return
                session.createQuery("select  t from User t where t.id = :id", User.class)
                        .setParameter("id", toIntExact)
                        .getSingleResultOrNull();
    }

    public static User findByIdForUI(int toIntExact) {
        Session session = HibernateConfigurer.getSession();
        return
                session.createQuery("select  t from User t where t.id = :id", User.class)
                        .setParameter("id", toIntExact)
                        .getSingleResultOrNull();
    }
}

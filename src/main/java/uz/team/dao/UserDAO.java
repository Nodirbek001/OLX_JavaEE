package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.User;
import uz.team.dto.user.RegisterDTO;
import uz.team.exceptions.BadRequestException;

import java.util.List;
import java.util.Objects;
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
    public User findByUsername1(String username) {
        Session session = HibernateConfigurer.getSession();
        return
                session.createQuery("select  t from User t where t.username = :username", User.class)
                        .setParameter("username", username)
                        .getSingleResultOrNull();
    }

    public Long update(Long id, RegisterDTO dto){
        if (Objects.isNull(id)) {
            throw new BadRequestException("User has not logged in yet!");
        }
        Session session = HibernateConfigurer.getSession();
        User user = session.createQuery("select t from User t where t.id = :id", User.class).setParameter("id", id).getSingleResultOrNull();
        if (Objects.isNull(user)){
            throw new BadRequestException("User not found!");
        }
//        session.createQuery("update User set fullName = :dto.fullname")


        return id;
    }
}

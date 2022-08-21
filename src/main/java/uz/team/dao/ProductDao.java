package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.Product;
import uz.team.dto.user.RegisterDTO;

import java.util.List;

public class ProductDao implements Dao<Product> {
    @Override
    public Product create(Product entity) {
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
    public List<Product> findAll() {
        Session session = HibernateConfigurer.getSession();
        return session.createQuery("select t from Product t", Product.class).getResultList();
    }

    @Override
    public Product findOne(Long id) {
        return null;
    }


}

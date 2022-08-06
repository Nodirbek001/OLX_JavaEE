package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.Category;

import java.util.List;

public class CategoryDAO implements Dao<Category> {

    @Override
    public Category create(Category entity) {
        Session session=HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findOne(Long id) {
        return null;
    }
    public Category findByName(String categoryName){
        Session session= HibernateConfigurer.getSession();
        session.getTransaction().begin();
        Category name = session.createQuery("select t from Category t where t.name=:name", Category.class)
                .setParameter("name", categoryName)
                .getSingleResult();
        session.getTransaction().commit();
        return name;
    }
}

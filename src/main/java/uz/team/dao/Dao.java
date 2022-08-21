package uz.team.dao;

import uz.team.dto.user.RegisterDTO;

import java.util.List;

public interface Dao<T> {
    T create(T entity);

    void delete(Long id);

    List<T> findAll();

    T findOne(Long id);

}

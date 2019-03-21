package test.dao;

import java.util.List;

/**
 *
 * @author Jeroen Roovers
 */
public interface IDao<T> {

    public void save(T object);

    public List<T> getAll();

    public T findById(Long id);

    public void update(T object);

    public void delete(T object);
}

package test.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import test.model.Person;

/**
 *
 * @author Jeroen Roovers
 */
@Stateless
public class personDao implements IDao<Person> {

    @PersistenceContext(name = "testPU")
    EntityManager em;

    @Override
    public void save(Person object) {
        em.persist(object);
    }

    @Override
    public List<Person> getAll() {
        return em.createNamedQuery("Person.findAll", Person.class).getResultList();
    }

    @Override
    public Person findById(Long id) {
        return em.find(Person.class, id);
    }

    @Override
    public void update(Person object) {
        em.merge(object);
    }

    @Override
    public void delete(Person object) {
        em.remove(object);
    }

}

package test.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import test.model.Puppy;

/**
 *
 * @author Jeroen Roovers
 */
@Stateless
public class puppyDao implements IDao<Puppy> {

    @PersistenceContext(name = "testPU")
    EntityManager em;

    @Override
    public void save(Puppy object) {
        em.persist(object);
    }

    @Override
    public List<Puppy> getAll() {
        return em.createNamedQuery("Person.findAll", Puppy.class).getResultList();
    }

    @Override
    public Puppy findById(Long id) {
        return em.find(Puppy.class, id);
    }

    @Override
    public void update(Puppy object) {
        em.merge(object);
    }

    @Override
    public void delete(Puppy object) {
        em.remove(object);
    }
}

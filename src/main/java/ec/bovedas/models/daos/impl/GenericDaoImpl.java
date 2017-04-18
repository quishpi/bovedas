package ec.bovedas.models.daos.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import ec.bovedas.models.daos.GenericDao;

public class GenericDaoImpl<T, ID extends Serializable> implements GenericDao<T, ID> {

	@PersistenceContext(unitName = "bovedaspu")
	protected EntityManager em;

	private final Class<T> entityClass;

	public GenericDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public void setEm(final EntityManager em) {
		this.em = em;
	}

	@Override
	public void create(T entity) {
		em.persist(entity);
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	}

	@Override
	public void delete(T entity) {
		em.remove(entity);
	}

	@Override
	public void flush() {
		em.flush();
	}

	@Override
	public T find(ID id) {
		return em.find(entityClass, id);
	}

	@Override
	public List<T> findAll() {
		em.flush();
		CriteriaQuery<T> cq = em.getCriteriaBuilder().createQuery(entityClass);
		CriteriaQuery<T> all = cq.select(cq.from(entityClass));
		return em.createQuery(all).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findRange(int[] range) {
		em.flush();
		CriteriaQuery<T> cq = em.getCriteriaBuilder().createQuery(entityClass);
		cq.select(cq.from(entityClass));
		Query q = em.createQuery(cq);
		q.setMaxResults(range[1] - range[0]);
		q.setFirstResult(range[0]);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Integer count() {
		em.flush();
		CriteriaQuery<T> cq = em.getCriteriaBuilder().createQuery(entityClass);
		Root<T> rt = cq.from(entityClass);
		cq.select((Selection<? extends T>) em.getCriteriaBuilder().count(rt));
		Query q = em.createQuery(cq);
		return ((Long) q.getSingleResult()).intValue();
	}

}

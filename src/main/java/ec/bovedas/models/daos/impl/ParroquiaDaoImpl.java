package ec.bovedas.models.daos.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.bovedas.models.daos.ParroquiaDao;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Parroquia;

@Stateless
public class ParroquiaDaoImpl extends GenericDaoImpl<Parroquia, Integer> implements ParroquiaDao {
	@PersistenceContext
	EntityManager em;

	public ParroquiaDaoImpl() {

		super(Parroquia.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Parroquia> find(Canton canton) {
		List<Parroquia> result = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT c FROM Parroquia c ");
		sql.append("WHERE c.canton = :canton");
		Query query = em.createQuery(sql.toString());
		query.setParameter("canton", canton);

		if (!query.getResultList().isEmpty()) {
			result = query.getResultList();
		}
		return result;
	}
}

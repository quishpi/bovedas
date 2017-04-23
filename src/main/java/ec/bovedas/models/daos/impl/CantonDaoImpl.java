package ec.bovedas.models.daos.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.bovedas.models.daos.CantonDao;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Provincia;

@Stateless
public class CantonDaoImpl extends GenericDaoImpl<Canton, Integer> implements CantonDao {

	@PersistenceContext
	EntityManager em;

	public CantonDaoImpl() {
		super(Canton.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Canton> find(Provincia provincia) {
		List<Canton> result = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT c FROM Canton c ");
		sql.append("WHERE c.provincia = :provincia");
		Query query = em.createQuery(sql.toString());
		query.setParameter("provincia", provincia);

		if (!query.getResultList().isEmpty()) {
			result = query.getResultList();
		}
		return result;
	}

}

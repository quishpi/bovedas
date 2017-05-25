package ec.bovedas.models.daos.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.bovedas.models.daos.RepresentanteDao;
import ec.bovedas.models.entities.Representante;

@Stateless
public class RepresentanteDaoImpl extends GenericDaoImpl<Representante, Integer> implements RepresentanteDao {

	public RepresentanteDaoImpl() {
		super(Representante.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Representante> findRepresentante(String criterio) {
		List<Representante> result = new ArrayList<Representante>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT r FROM Representante r ");
		sql.append("WHERE concat(r.cedula,r.nombre,r.apelido) like :criterio");

		Query query = em.createQuery(sql.toString());
		query.setParameter("criterio", "%" + criterio + "%");

		if (!query.getResultList().isEmpty()) {
			result = query.getResultList();
		}
		return result;
	}

}

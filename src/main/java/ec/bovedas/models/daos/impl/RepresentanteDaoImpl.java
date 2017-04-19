package ec.bovedas.models.daos.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.RepresentanteDao;
import ec.bovedas.models.entities.Representante;

public class RepresentanteDaoImpl extends GenericDaoImpl<Representante, Integer> implements RepresentanteDao {

	@PersistenceContext
	EntityManager em;

	public RepresentanteDaoImpl() {
		super(Representante.class);
	}

}

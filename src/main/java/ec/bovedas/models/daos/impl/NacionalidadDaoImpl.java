package ec.bovedas.models.daos.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.NacionalidadDao;
import ec.bovedas.models.entities.Nacionalidad;

public class NacionalidadDaoImpl extends GenericDaoImpl<Nacionalidad, Integer> implements NacionalidadDao {

	@PersistenceContext
	EntityManager em;

	public NacionalidadDaoImpl(Class<Nacionalidad> entityClass) {
		super(entityClass);
	}

}

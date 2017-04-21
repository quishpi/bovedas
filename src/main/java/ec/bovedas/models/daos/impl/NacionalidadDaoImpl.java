package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.NacionalidadDao;
import ec.bovedas.models.entities.Nacionalidad;

@Stateless
public class NacionalidadDaoImpl extends GenericDaoImpl<Nacionalidad, Integer> implements NacionalidadDao {

	@PersistenceContext
	EntityManager em;

	public NacionalidadDaoImpl() {

		super(Nacionalidad.class);
	}

}

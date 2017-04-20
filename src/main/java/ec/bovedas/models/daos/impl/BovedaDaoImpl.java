package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.BovedaDao;
import ec.bovedas.models.entities.Boveda;

@Stateless
public class BovedaDaoImpl extends GenericDaoImpl<Boveda, Integer> implements BovedaDao {

	@PersistenceContext
	EntityManager em;

	public BovedaDaoImpl() {

		super(Boveda.class);
	}

}

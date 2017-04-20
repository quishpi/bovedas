package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.HistorialBovedaDao;
import ec.bovedas.models.entities.HistorialBoveda;

@Stateless
public class HistorialBovedaDaoImpl extends GenericDaoImpl<HistorialBoveda, Integer> implements HistorialBovedaDao {
	@PersistenceContext
	EntityManager em;

	public HistorialBovedaDaoImpl() {

		super(HistorialBoveda.class);
	}

}

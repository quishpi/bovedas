package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.FallecidoDao;
import ec.bovedas.models.entities.Fallecido;

@Stateless
public class FallecidoDaoImpl extends GenericDaoImpl<Fallecido, Integer> implements FallecidoDao {

	@PersistenceContext
	EntityManager em;

	public FallecidoDaoImpl() {

		super(Fallecido.class);
	}

}

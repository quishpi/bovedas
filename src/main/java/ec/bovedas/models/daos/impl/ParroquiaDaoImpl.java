package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.ParroquiaDao;
import ec.bovedas.models.entities.Parroquia;

@Stateless
public class ParroquiaDaoImpl extends GenericDaoImpl<Parroquia, Integer> implements ParroquiaDao {
	@PersistenceContext
	EntityManager em;

	public ParroquiaDaoImpl() {

		super(Parroquia.class);
	}

}
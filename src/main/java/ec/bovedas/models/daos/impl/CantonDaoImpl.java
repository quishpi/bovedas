package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.CantonDao;

import ec.bovedas.models.entities.Canton;

@Stateless
public class CantonDaoImpl extends GenericDaoImpl<Canton, Integer> implements CantonDao {

	@PersistenceContext
	EntityManager em;

	public CantonDaoImpl() {
		super(Canton.class);
	}

}

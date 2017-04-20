package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.MausoleoDao;
import ec.bovedas.models.entities.Mausoleo;

@Stateless
public class MausoleoDaoImpl extends GenericDaoImpl<Mausoleo, Integer> implements MausoleoDao {
	@PersistenceContext
	EntityManager em;

	public MausoleoDaoImpl() {

		super(Mausoleo.class);
	}

}

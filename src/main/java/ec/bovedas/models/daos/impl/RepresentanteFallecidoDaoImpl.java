package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.bovedas.models.daos.RepresentanteFallecidoDao;
import ec.bovedas.models.entities.RepresentanteFallecido;

@Stateless
public class RepresentanteFallecidoDaoImpl extends GenericDaoImpl<RepresentanteFallecido, Integer>
		implements RepresentanteFallecidoDao {

	@PersistenceContext
	EntityManager em;

	public RepresentanteFallecidoDaoImpl() {

		super(RepresentanteFallecido.class);
	}

}

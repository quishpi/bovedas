package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.FacturaCabeceraDao;
import ec.bovedas.models.entities.FacturaCabecera;


@Stateless
public class FacturaCabeceraDaoImpl extends GenericDaoImpl<FacturaCabecera, Integer> implements FacturaCabeceraDao{
	@PersistenceContext
	EntityManager em;

	public FacturaCabeceraDaoImpl() {

		super(FacturaCabecera.class);
	}

}




package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.PeriodoPrecioDao;
import ec.bovedas.models.entities.PeriodoPrecio;


@Stateless
public class PeriodoPrecioDaoImpl extends GenericDaoImpl<PeriodoPrecio, Integer> implements PeriodoPrecioDao {
	
	@PersistenceContext
	EntityManager em;

	public PeriodoPrecioDaoImpl() {

		super(PeriodoPrecio.class);
	}

}





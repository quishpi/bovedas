package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.FacturaDetalleDao;
import ec.bovedas.models.entities.FacturaDetalle;

@Stateless
public class FacturaDetalleDaoImpl extends GenericDaoImpl<FacturaDetalle, Integer> implements FacturaDetalleDao {
	@PersistenceContext
	EntityManager em;

	public FacturaDetalleDaoImpl() {

		super(FacturaDetalle.class);
	}

}

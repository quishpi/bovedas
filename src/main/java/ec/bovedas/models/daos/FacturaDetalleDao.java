package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.FacturaDetalle;

@Local
public interface FacturaDetalleDao extends GenericDao<FacturaDetalle, Integer> {

}

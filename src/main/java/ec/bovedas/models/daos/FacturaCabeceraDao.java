package ec.bovedas.models.daos;

import javax.ejb.Local;
import ec.bovedas.models.entities.FacturaCabecera;

@Local
public interface FacturaCabeceraDao extends GenericDao<FacturaCabecera, Integer> {

}

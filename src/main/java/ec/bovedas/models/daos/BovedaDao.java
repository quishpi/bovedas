package ec.bovedas.models.daos;

import javax.ejb.Local;
import ec.bovedas.models.entities.Boveda;

@Local
public interface BovedaDao extends GenericDao<Boveda, Integer> {

}

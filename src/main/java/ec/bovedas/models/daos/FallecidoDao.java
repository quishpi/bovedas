package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Fallecido;

@Local
public interface FallecidoDao extends GenericDao<Fallecido, Integer> {

}

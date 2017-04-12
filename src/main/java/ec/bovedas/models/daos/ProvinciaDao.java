package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Provincia;

@Local

public interface ProvinciaDao extends GenericDao<Provincia, Integer> {

}

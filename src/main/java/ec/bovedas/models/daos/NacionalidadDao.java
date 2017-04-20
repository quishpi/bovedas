package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Nacionalidad;

@Local
public interface NacionalidadDao extends GenericDao<Nacionalidad, Integer> {

}

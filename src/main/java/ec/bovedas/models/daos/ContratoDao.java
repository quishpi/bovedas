package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Contrato;

@Local
public interface ContratoDao extends GenericDao<Contrato, Integer> {

}

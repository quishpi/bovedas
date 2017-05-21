package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Empresa;

@Local
public interface EmpresaDao extends GenericDao<Empresa, Integer> {

}

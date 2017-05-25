package ec.bovedas.models.daos;

import java.util.List;

import javax.ejb.Local;

import ec.bovedas.models.entities.Representante;

@Local
public interface RepresentanteDao extends GenericDao<Representante, Integer> {
	public List<Representante> findRepresentante(String criterio);
}

package ec.bovedas.models.daos;

import java.util.List;

import javax.ejb.Local;

import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Parroquia;


@Local
public interface ParroquiaDao extends GenericDao<Parroquia, Integer> {
	public List<Parroquia> find(Canton canton);

}




package ec.bovedas.models.daos;

import java.util.List;

import javax.ejb.Local;

import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Provincia;

@Local
public interface CantonDao extends GenericDao<Canton, Integer> {
	
	public List<Canton> find(Provincia provincia);
}

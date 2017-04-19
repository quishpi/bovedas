package ec.bovedas.models.daos;

import javax.ejb.Local;
import ec.bovedas.models.entities.Mausoleo;

@Local
public interface MausoleoDao extends GenericDao<Mausoleo, Integer> {

}

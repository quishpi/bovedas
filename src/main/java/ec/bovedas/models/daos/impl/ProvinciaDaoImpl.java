package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.ProvinciaDao;
import ec.bovedas.models.entities.Provincia;

@Stateless
public class ProvinciaDaoImpl extends GenericDaoImpl<Provincia, Integer> implements ProvinciaDao {
	@PersistenceContext
	EntityManager em;

	public ProvinciaDaoImpl() {

		super(Provincia.class);
	}

}

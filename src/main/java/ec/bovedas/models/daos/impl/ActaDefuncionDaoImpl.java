package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.ActaDefuncionDao;
import ec.bovedas.models.entities.ActaDefuncion;

@Stateless
public class ActaDefuncionDaoImpl extends GenericDaoImpl<ActaDefuncion, Integer> implements ActaDefuncionDao {

	@PersistenceContext
	EntityManager em;

	public ActaDefuncionDaoImpl() {

		super(ActaDefuncion.class);
	}

}

package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.EmpresaDao;
import ec.bovedas.models.entities.Empresa;


@Stateless
public class EmpresaDaoImpl extends GenericDaoImpl<Empresa, Integer> implements EmpresaDao {
	@PersistenceContext
	EntityManager em;

	public EmpresaDaoImpl() {

		super(Empresa.class);
	}

}

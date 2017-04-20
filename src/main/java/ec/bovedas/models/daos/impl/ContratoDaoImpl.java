package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.bovedas.models.daos.ContratoDao;
import ec.bovedas.models.entities.Contrato;

@Stateless
public class ContratoDaoImpl extends GenericDaoImpl<Contrato, Integer> implements ContratoDao {
	@PersistenceContext
	EntityManager em;

	public ContratoDaoImpl() {

		super(Contrato.class);
	}

}

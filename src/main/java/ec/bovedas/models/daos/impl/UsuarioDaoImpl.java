package ec.bovedas.models.daos.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.bovedas.models.daos.UsuarioDao;
import ec.bovedas.models.entities.Usuario;

@Stateless
public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements UsuarioDao {

	@PersistenceContext
	EntityManager em;

	public UsuarioDaoImpl() {
		super(Usuario.class);
	}

	@Override
	public Usuario findUsuario(String cedula, String clave) {
		Usuario result = new Usuario();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT u FROM Usuario u ");
		sql.append("WHERE u.cedula = :cedula and clave = :clave");

		Query query = em.createQuery(sql.toString());
		query.setParameter("cedula", cedula).setParameter("clave", clave);

		if (!query.getResultList().isEmpty()) {
			result = (Usuario) query.getSingleResult();
		}
		return result;
	}

}

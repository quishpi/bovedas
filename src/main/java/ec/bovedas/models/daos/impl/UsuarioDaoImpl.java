package ec.bovedas.models.daos.impl;

import javax.persistence.Query;

import ec.bovedas.models.daos.UsuarioDao;
import ec.bovedas.models.entities.Usuario;

public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements
		UsuarioDao {

	public UsuarioDaoImpl() {
		super(Usuario.class);
	}

	@Override
	public Usuario findUsuario(String usuario, String clave) {
		Usuario result = new Usuario();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT u FROM Usuario u ");
		sql.append("WHERE u.usuario = :usuario and clave = :clave");

		Query query = em.createQuery(sql.toString());
		query.setParameter("usuario", usuario).setParameter("clave", clave);

		if (!query.getResultList().isEmpty()) {
			result = (Usuario) query.getSingleResult();
		}
		return result;
	}

}

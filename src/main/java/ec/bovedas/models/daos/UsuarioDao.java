package ec.bovedas.models.daos;

import ec.bovedas.models.entities.Usuario;

public interface UsuarioDao extends GenericDao<Usuario,Integer> {

	Usuario findUsuario(String usuario, String clave);
}

package ec.bovedas.models.daos;

import javax.ejb.Local;

import ec.bovedas.models.entities.Usuario;

@Local
public interface UsuarioDao extends GenericDao<Usuario, Integer> {

	Usuario findUsuario(String cedula, String clave);
}

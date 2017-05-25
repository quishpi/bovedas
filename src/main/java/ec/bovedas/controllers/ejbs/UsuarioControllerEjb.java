package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.daos.UsuarioDao;
import ec.bovedas.models.entities.Usuario;

@Stateless
public class UsuarioControllerEjb implements UsuarioController {

	@Inject
	private UsuarioDao usuarioDao;

	public UsuarioControllerEjb() {

	}

	@Override
	public String guardar(Usuario entity, Boolean esNuevo) {
		String msg = null;
		if (esNuevo) {
			msg = usuarioDao.create(entity);
		} else {
			msg = usuarioDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Usuario entity) {
		return usuarioDao.delete(entity);
	}

	@Override
	public Usuario buscar(Integer id) {
		return usuarioDao.find(id);
	}

	@Override
	public Usuario buscar(String cedula) {
		return usuarioDao.findUsuario(cedula);
	}

	@Override
	public List<Usuario> listarTodo() {
		return usuarioDao.findAll();
	}

	@Override
	public Integer contar() {
		return usuarioDao.count();
	}

}
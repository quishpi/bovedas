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
	
	public UsuarioControllerEjb(){
		
	}

	@Override
	public void guardar(Usuario entity, Boolean nuevo) {
		if (nuevo) {
			usuarioDao.create(entity);
		} else {
			usuarioDao.update(entity);
		}
	}

	@Override
	public void eliminar(Usuario entity) {
		usuarioDao.delete(entity);
	}

	@Override
	public Usuario buscar(Integer id) {
		return usuarioDao.find(id);
	}

	@Override
	public Usuario buscar(String usuario, String clave) {
		return usuarioDao.findUsuario(usuario, clave);
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
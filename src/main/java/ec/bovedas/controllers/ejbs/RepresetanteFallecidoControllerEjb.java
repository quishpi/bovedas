package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.RepresetanteFallecidoController;
import ec.bovedas.models.daos.RepresentanteFallecidoDao;
import ec.bovedas.models.entities.RepresentanteFallecido;

@Stateless
public class RepresetanteFallecidoControllerEjb implements RepresetanteFallecidoController {

	@Inject
	private RepresentanteFallecidoDao representanteFallecidoDao;

	public RepresetanteFallecidoControllerEjb() {

	}

	@Override
	public void guardar(RepresentanteFallecido entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			representanteFallecidoDao.create(entity);
		} else {
			representanteFallecidoDao.update(entity);
		}

	}

	@Override
	public void eliminar(RepresentanteFallecido entity) {
		// TODO Auto-generated method stub
		representanteFallecidoDao.delete(entity);
	}

	@Override
	public RepresentanteFallecido buscar(Integer id) {
		// TODO Auto-generated method stub
		return representanteFallecidoDao.find(id);
	}

	@Override
	public RepresentanteFallecido buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RepresentanteFallecido> listarTodo() {
		// TODO Auto-generated method stub
		return representanteFallecidoDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return representanteFallecidoDao.count();
	}

}

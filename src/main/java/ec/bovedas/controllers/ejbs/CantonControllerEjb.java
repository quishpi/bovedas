package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.inject.Inject;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.models.daos.CantonDao;
import ec.bovedas.models.entities.Canton;


public class CantonControllerEjb implements CantonController {

	@Inject
	private CantonDao cantonDao;

	public CantonControllerEjb() {

	}

	@Override
	public void guardar(Canton entity, Boolean nuevo) {
		if (nuevo) {
			cantonDao.create(entity);
		} else {
			cantonDao.update(entity);
		}
	}

	@Override
	public void eliminar(Canton entity) {
		cantonDao.delete(entity);
	}

	@Override
	public Canton buscar(Integer id) {
		return cantonDao.find(id);
	}

	@Override
	public List<Canton> listarTodo() {
		return cantonDao.findAll();
	}

	@Override
	public Integer contar() {
		return cantonDao.count();
	}

	@Override
	public Canton buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

}

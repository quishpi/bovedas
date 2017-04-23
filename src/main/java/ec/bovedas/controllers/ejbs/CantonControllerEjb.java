package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.models.daos.CantonDao;
import ec.bovedas.models.entities.Canton;

@Stateless
public class CantonControllerEjb implements CantonController {

	@Inject
	private CantonDao cantonDao;

	public CantonControllerEjb() {

	}

	@Override
	public String guardar(Canton entity, Boolean esNuevo) {
		String msg = null;
		if (esNuevo) {
			msg = cantonDao.create(entity);
		} else {
			msg = cantonDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Canton entity) {
		String msg = null;
		msg = cantonDao.delete(entity);
		return msg;
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

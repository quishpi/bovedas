package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.ParroquiaController;
import ec.bovedas.models.daos.ParroquiaDao;
import ec.bovedas.models.entities.Parroquia;

@Stateless
public class ParroquiaControllerEjb implements ParroquiaController {

	@Inject
	private ParroquiaDao parroquiaDao;

	public ParroquiaControllerEjb() {

	}

	@Override
	public String guardar(Parroquia entity, Boolean esNuevo) {
		String msg = null;
		if (esNuevo) {
			msg = parroquiaDao.create(entity);
		} else {
			msg = parroquiaDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Parroquia entity) {
		return parroquiaDao.delete(entity);
	}

	@Override
	public Parroquia buscar(Integer id) {
		return parroquiaDao.find(id);
	}

	@Override
	public List<Parroquia> listarTodo() {
		return parroquiaDao.findAll();
	}

	@Override
	public Integer contar() {
		return parroquiaDao.count();
	}

}

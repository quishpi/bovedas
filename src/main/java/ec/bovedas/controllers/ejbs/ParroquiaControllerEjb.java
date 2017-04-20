package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.inject.Inject;

import ec.bovedas.controllers.ParroquiaController;
import ec.bovedas.models.daos.ParroquiaDao;
import ec.bovedas.models.entities.Parroquia;

public class ParroquiaControllerEjb implements ParroquiaController {

	@Inject
	private ParroquiaDao parroquiaDao;

	public ParroquiaControllerEjb() {

	}

	@Override
	public void guardar(Parroquia entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			parroquiaDao.create(entity);
		} else {
			parroquiaDao.update(entity);
		}
	}

	@Override
	public void eliminar(Parroquia entity) {
		// TODO Auto-generated method stub

		parroquiaDao.delete(entity);

	}

	@Override
	public Parroquia buscar(Integer id) {
		// TODO Auto-generated method stub
		return parroquiaDao.find(id);

	}

	@Override
	public Parroquia buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parroquia> listarTodo() {
		// TODO Auto-generated method stub
		return parroquiaDao.findAll();

	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return parroquiaDao.count();
	}

}

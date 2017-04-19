package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.inject.Inject;

import ec.bovedas.controllers.RepresentanteController;
import ec.bovedas.models.daos.RepresentanteDao;
import ec.bovedas.models.entities.Representante;

public class RepresentanteControllerEjb implements RepresentanteController {

	@Inject
	private RepresentanteDao representanteDao;

	public RepresentanteControllerEjb() {

	}

	@Override
	public void guardar(Representante entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			representanteDao.create(entity);
		} else {
			representanteDao.update(entity);
		}

	}

	@Override
	public void eliminar(Representante entity) {
		// TODO Auto-generated method stub
		representanteDao.delete(entity);

	}

	@Override
	public Representante buscar(Integer id) {
		// TODO Auto-generated method stub
		return representanteDao.find(id);
	}

	@Override
	public Representante buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Representante> listarTodo() {
		// TODO Auto-generated method stub
		return representanteDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return representanteDao.count();
	}

}

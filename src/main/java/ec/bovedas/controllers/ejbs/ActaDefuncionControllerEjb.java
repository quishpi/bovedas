package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.ActaDefuncionController;
import ec.bovedas.models.daos.ActaDefuncionDao;
import ec.bovedas.models.entities.ActaDefuncion;

@Stateless
public class ActaDefuncionControllerEjb implements ActaDefuncionController {

	@Inject
	private ActaDefuncionDao actaDefuncionDao;

	@Override
	public void guardar(ActaDefuncion entity, Boolean nuevo) {
		// TODO Auto-generated method stub

		if (nuevo) {
			actaDefuncionDao.create(entity);
		} else {
			actaDefuncionDao.update(entity);
		}

	}

	@Override
	public void eliminar(ActaDefuncion entity) {
		// TODO Auto-generated method stub
		actaDefuncionDao.delete(entity);

	}

	@Override
	public ActaDefuncion buscar(Integer id) {
		// TODO Auto-generated method stub
		return actaDefuncionDao.find(id);
	}

	@Override
	public ActaDefuncion buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActaDefuncion> listarTodo() {
		// TODO Auto-generated method stub
		return actaDefuncionDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return actaDefuncionDao.count();
	}

}

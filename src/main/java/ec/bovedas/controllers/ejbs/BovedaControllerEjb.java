package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.BovedaController;
import ec.bovedas.models.daos.BovedaDao;
import ec.bovedas.models.entities.Boveda;

@Stateless
public class BovedaControllerEjb implements BovedaController {

	@Inject
	private BovedaDao bovedaDao;

	public BovedaControllerEjb() {

	}

	@Override
	public void guardar(Boveda entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			bovedaDao.create(entity);
		} else {
			bovedaDao.update(entity);
		}

	}

	@Override
	public void eliminar(Boveda entity) {
		// TODO Auto-generated method stub
		bovedaDao.delete(entity);
	}

	@Override
	public Boveda buscar(Integer id) {
		// TODO Auto-generated method stub
		return bovedaDao.find(id);
	}

	@Override
	public Boveda buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Boveda> listarTodo() {
		// TODO Auto-generated method stub
		return bovedaDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return bovedaDao.count();
	}

}

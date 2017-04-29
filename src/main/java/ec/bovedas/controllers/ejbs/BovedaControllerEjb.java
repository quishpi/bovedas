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
	public String guardar(Boveda entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		String msg = null;
		if (nuevo) {
			msg = bovedaDao.create(entity);
		} else {
			msg = bovedaDao.update(entity);
		}
		return msg;

	}

	@Override
	public String eliminar(Boveda entity) {
		// TODO Auto-generated method stub
		return bovedaDao.delete(entity);
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

package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.HistorialBovedadController;
import ec.bovedas.models.daos.HistorialBovedaDao;
import ec.bovedas.models.entities.HistorialBoveda;

@Stateless
public class HistorialBovedaControllerEjb implements HistorialBovedadController {

	@Inject
	private HistorialBovedaDao historialBovedaDao;

	public HistorialBovedaControllerEjb() {

	}

	@Override
	public void guardar(HistorialBoveda entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			historialBovedaDao.create(entity);
		} else {
			historialBovedaDao.update(entity);
		}

	}

	@Override
	public void eliminar(HistorialBoveda entity) {
		// TODO Auto-generated method stub
		historialBovedaDao.delete(entity);

	}

	@Override
	public HistorialBoveda buscar(Integer id) {
		// TODO Auto-generated method stub
		return historialBovedaDao.find(id);
	}

	@Override
	public HistorialBoveda buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistorialBoveda> listarTodo() {
		// TODO Auto-generated method stub
		return historialBovedaDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return historialBovedaDao.count();
	}

}

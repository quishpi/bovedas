package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.PeriodoPrecioController;
import ec.bovedas.models.daos.PeriodoPrecioDao;
import ec.bovedas.models.entities.PeriodoPrecio;

@Stateless
public class PeriodoPrecioControllerEjb implements PeriodoPrecioController {

	@Inject
	private PeriodoPrecioDao periodoPrecioDao;

	public PeriodoPrecioControllerEjb() {

	}

	@Override
	public String guardar(PeriodoPrecio entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		String msg = null;
		if (nuevo) {
			msg= periodoPrecioDao.create(entity);
		} else {
			msg=periodoPrecioDao.update(entity);
		}
		return msg;

	}

	@Override
	public String eliminar(PeriodoPrecio entity) {
		// TODO Auto-generated method stub
		return periodoPrecioDao.delete(entity);

	}

	@Override
	public PeriodoPrecio buscar(Integer id) {
		// TODO Auto-generated method stub
		return periodoPrecioDao.find(id);
	}

	@Override
	public PeriodoPrecio buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PeriodoPrecio> listarTodo() {
		// TODO Auto-generated method stub
		return periodoPrecioDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return periodoPrecioDao.count();
	}

}

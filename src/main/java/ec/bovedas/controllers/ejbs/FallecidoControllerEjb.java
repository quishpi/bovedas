package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.FallecidoController;
import ec.bovedas.models.daos.FallecidoDao;
import ec.bovedas.models.entities.Fallecido;

@Stateless
public class FallecidoControllerEjb implements FallecidoController {

	@Inject
	private FallecidoDao fallecidoDao;

	public FallecidoControllerEjb() {

	}

	@Override
	public String guardar(Fallecido entity, Boolean nuevo) {
		// TODO Auto-generated method stub

		String msg = null;
		if (nuevo) {
			msg = fallecidoDao.create(entity);
		} else {
			msg = fallecidoDao.update(entity);
		}
		return msg;

	}

	@Override
	public String eliminar(Fallecido entity) {
		// TODO Auto-generated method stub
		return fallecidoDao.delete(entity);

	}

	@Override
	public Fallecido buscar(Integer id) {
		// TODO Auto-generated method stub
		return fallecidoDao.find(id);
	}

	@Override
	public Fallecido buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fallecido> listarTodo() {
		// TODO Auto-generated method stub
		return fallecidoDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return fallecidoDao.count();
	}

}

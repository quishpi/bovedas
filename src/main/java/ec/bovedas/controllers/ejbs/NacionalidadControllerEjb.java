package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.bovedas.controllers.NacionalidadController;
import ec.bovedas.models.daos.NacionalidadDao;
import ec.bovedas.models.entities.Nacionalidad;

@Stateless
public class NacionalidadControllerEjb implements NacionalidadController {

	@Inject
	private NacionalidadDao nacionalidadDao;

	public NacionalidadControllerEjb() {

	}

	@Override
	public void guardar(Nacionalidad entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			nacionalidadDao.create(entity);
		} else {
			nacionalidadDao.update(entity);
		}
	}

	@Override
	public void eliminar(Nacionalidad entity) {
		// TODO Auto-generated method stub
		nacionalidadDao.delete(entity);
	}

	@Override
	public Nacionalidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return nacionalidadDao.find(id);
	}

	@Override
	public Nacionalidad buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nacionalidad> listarTodo() {
		// TODO Auto-generated method stub
		return nacionalidadDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return nacionalidadDao.count();
	}

}

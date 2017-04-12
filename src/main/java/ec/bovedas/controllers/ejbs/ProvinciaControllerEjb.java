package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.ProvinciaController;
import ec.bovedas.models.daos.ProvinciaDao;
import ec.bovedas.models.entities.Provincia;

@Stateless
public class ProvinciaControllerEjb implements ProvinciaController {

	@Inject
	private ProvinciaDao provinciaDao;

	public ProvinciaControllerEjb() {

	}

	@Override
	public void guardar(Provincia entity, Boolean nuevo) {
		if (nuevo) {
			provinciaDao.create(entity);
		} else {
			provinciaDao.update(entity);
		}
	}

	@Override
	public void eliminar(Provincia entity) {
		provinciaDao.delete(entity);
	}

	@Override
	public Provincia buscar(Integer id) {
		return provinciaDao.find(id);
	}

	@Override
	public List<Provincia> listarTodo() {
		return provinciaDao.findAll();
	}

	@Override
	public Integer contar() {
		return provinciaDao.count();
	}

	@Override
	public Provincia buscar(String provincia, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

}

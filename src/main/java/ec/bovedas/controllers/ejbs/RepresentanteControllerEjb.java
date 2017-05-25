package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.RepresentanteController;
import ec.bovedas.models.daos.RepresentanteDao;
import ec.bovedas.models.entities.Representante;

@Stateless
public class RepresentanteControllerEjb implements RepresentanteController {

	@Inject
	private RepresentanteDao representanteDao;

	public RepresentanteControllerEjb() {

	}

	@Override
	public String guardar(Representante entity, Boolean nuevo) {
		String msg = null;
		if (nuevo) {
			msg = representanteDao.create(entity);
		} else {
			msg = representanteDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Representante entity) {
		return representanteDao.delete(entity);

	}

	@Override
	public Representante buscar(Integer id) {
		return representanteDao.find(id);
	}

	@Override
	public Representante buscar(String usuario, String clave) {
		return null;
	}

	@Override
	public List<Representante> listarTodo() {
		return representanteDao.findAll();
	}

	@Override
	public Integer contar() {
		return representanteDao.count();
	}

	@Override
	public List<Representante> listarRepresentante(String criterio) {
		return representanteDao.findRepresentante(criterio);
	}

}

package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.hibernate.loader.custom.Return;

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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return representanteDao.delete(entity);

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

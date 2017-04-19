package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.ContratoController;
import ec.bovedas.models.daos.ContratoDao;
import ec.bovedas.models.entities.Contrato;

@Stateless
public class ContratoControllerEjb implements ContratoController {

	@Inject
	private ContratoDao contratoDao;

	public ContratoControllerEjb() {

	}

	@Override
	public void guardar(Contrato entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			contratoDao.create(entity);
		} else {
			contratoDao.update(entity);
		}

	}

	@Override
	public void eliminar(Contrato entity) {
		// TODO Auto-generated method stub
		contratoDao.delete(entity);

	}

	@Override
	public Contrato buscar(Integer id) {
		// TODO Auto-generated method stub
		return contratoDao.find(id);
	}

	@Override
	public Contrato buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrato> listarTodo() {
		// TODO Auto-generated method stub
		return contratoDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return contratoDao.count();
	}

}

package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.FacturaCabeceraController;
import ec.bovedas.models.daos.FacturaCabeceraDao;
import ec.bovedas.models.entities.FacturaCabecera;

@Stateless
public class FacturaCabeceraControllerEjb implements FacturaCabeceraController {

	@Inject
	private FacturaCabeceraDao facturaCabeceraDao;

	public FacturaCabeceraControllerEjb() {

	}

	@Override
	public void guardar(FacturaCabecera entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		if (nuevo) {
			facturaCabeceraDao.create(entity);
		} else {
			facturaCabeceraDao.update(entity);
		}

	}

	@Override
	public void eliminar(FacturaCabecera entity) {
		// TODO Auto-generated method stub
		facturaCabeceraDao.delete(entity);

	}

	@Override
	public FacturaCabecera buscar(Integer id) {
		// TODO Auto-generated method stub
		return facturaCabeceraDao.find(id);
	}

	@Override
	public FacturaCabecera buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FacturaCabecera> listarTodo() {
		// TODO Auto-generated method stub
		return facturaCabeceraDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return facturaCabeceraDao.count();
	}

}

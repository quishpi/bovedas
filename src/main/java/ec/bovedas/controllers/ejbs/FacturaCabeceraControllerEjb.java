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
	public String guardar(FacturaCabecera entity, Boolean nuevo) {
		// TODO Auto-generated method stub

		String msg = null;
		if (nuevo) {
			msg = facturaCabeceraDao.create(entity);
		} else {
			msg = facturaCabeceraDao.update(entity);
		}
		return msg;

	}

	@Override
	public String eliminar(FacturaCabecera entity) {
		// TODO Auto-generated method stub
		String msg = null;
		facturaCabeceraDao.delete(entity);
		return msg;

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

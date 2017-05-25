package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.bovedas.controllers.FacturaDetalleController;
import ec.bovedas.models.daos.FacturaDetalleDao;
import ec.bovedas.models.entities.FacturaDetalle;

@Stateless
public class FacturaDetalleControllerEjb implements FacturaDetalleController {

	@Inject
	private FacturaDetalleDao facturaDetalleDao;

	public FacturaDetalleControllerEjb() {

	}

	@Override
	public String guardar(FacturaDetalle entity, Boolean nuevo) {
		// TODO Auto-generated method stub

		String msg = null;
		if (nuevo) {
			msg = facturaDetalleDao.create(entity);
		} else {
			msg = facturaDetalleDao.update(entity);
		}
		return msg;

	}
	@Override
	public String eliminar(FacturaDetalle entity) {
		// TODO Auto-generated method stub
		return facturaDetalleDao.delete(entity);
	}

	@Override
	public FacturaDetalle buscar(Integer id) {
		// TODO Auto-generated method stub
		return facturaDetalleDao.find(id);
	}

	@Override
	public FacturaDetalle buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FacturaDetalle> listarTodo() {
		// TODO Auto-generated method stub
		return facturaDetalleDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return facturaDetalleDao.count();
	}

}

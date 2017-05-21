package ec.bovedas.controllers.ejbs;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.bovedas.controllers.EmpresaController;
import ec.bovedas.models.daos.EmpresaDao;
import ec.bovedas.models.entities.Empresa;

@Stateless
public class EmpresaControllerEjb implements EmpresaController {

	@Inject
	private EmpresaDao empresaDao;

	public EmpresaControllerEjb() {

	}

	@Override
	public String guardar(Empresa entity, Boolean esNuevo) {
		String msg = null;
		if (esNuevo) {
			msg = empresaDao.create(entity);
		} else {
			msg = empresaDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Empresa entity) {
		return empresaDao.delete(entity);
	}

	@Override
	public Empresa buscar(Integer id) {
		return empresaDao.find(id);
	}

	@Override
	public List<Empresa> listarTodo() {
		return empresaDao.findAll();
	}

	@Override
	public Integer contar() {
		return empresaDao.count();
	}

}

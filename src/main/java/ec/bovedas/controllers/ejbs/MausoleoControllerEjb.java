package ec.bovedas.controllers.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.bovedas.controllers.MausoleoController;
import ec.bovedas.models.daos.MausoleoDao;
import ec.bovedas.models.entities.Mausoleo;

@Stateless
public class MausoleoControllerEjb implements MausoleoController {

	@Inject
	private MausoleoDao mausoleoDao;

	public MausoleoControllerEjb() {

	}

	@Override
	public String guardar(Mausoleo entity, Boolean nuevo) {
		// TODO Auto-generated method stub
		String msg = null;
		if (nuevo) {
			msg= mausoleoDao.create(entity);
		} else {
			msg=mausoleoDao.update(entity);
		}
		return msg;
	}

	@Override
	public String eliminar(Mausoleo entity) {
		// TODO Auto-generated method stub
		String msg = null;
		mausoleoDao.delete(entity);
		return msg;
		

	}

	@Override
	public Mausoleo buscar(Integer id) {
		// TODO Auto-generated method stub
		return mausoleoDao.find(id);
	}

	@Override
	public Mausoleo buscar(String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mausoleo> listarTodo() {
		// TODO Auto-generated method stub
		return mausoleoDao.findAll();
	}

	@Override
	public Integer contar() {
		// TODO Auto-generated method stub
		return mausoleoDao.count();
	}

}

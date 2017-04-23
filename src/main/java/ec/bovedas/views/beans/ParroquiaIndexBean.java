package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.ParroquiaController;
import ec.bovedas.models.entities.Parroquia;

@ManagedBean
@ViewScoped
public class ParroquiaIndexBean {

	private List<Parroquia> parroquias;

	@EJB
	private ParroquiaController parroquiaController;

	@PostConstruct
	public void update() {
		parroquias = parroquiaController.listarTodo();
	}

	public List<Parroquia> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	

}

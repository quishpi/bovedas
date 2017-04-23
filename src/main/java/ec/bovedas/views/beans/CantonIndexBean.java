package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.models.entities.Canton;

@ManagedBean
@ViewScoped
public class CantonIndexBean {

	private List<Canton> cantones;

	@EJB
	private CantonController cantonController;

	@PostConstruct
	public void update() {
		cantones = cantonController.listarTodo();
	}

	public List<Canton> getCantones() {
		return cantones;
	}

	public void setCantones(List<Canton> cantones) {
		this.cantones = cantones;
	}

}

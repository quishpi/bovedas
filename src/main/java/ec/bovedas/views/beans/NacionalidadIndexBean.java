package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.NacionalidadController;
import ec.bovedas.models.entities.Nacionalidad;

@ManagedBean
@ViewScoped
public class NacionalidadIndexBean {

	private List<Nacionalidad> nacionalidades;

	@EJB
	private NacionalidadController nacionalidadController;

	@PostConstruct
	public void init() {
		nacionalidades = nacionalidadController.listarTodo();
	}

	public List<Nacionalidad> getNacionalidades() {
		return nacionalidades;
	}

	public void setNacionalidades(List<Nacionalidad> nacionalidades) {
		this.nacionalidades = nacionalidades;
	}

}

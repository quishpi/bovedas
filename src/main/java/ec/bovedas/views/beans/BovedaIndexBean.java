package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.BovedaController;
import ec.bovedas.models.entities.Boveda;

@ManagedBean
@ViewScoped
public class BovedaIndexBean {

	private static final Logger LOGGER = Logger.getLogger(BovedaIndexBean.class);

	private List<Boveda> bovedas;

	@EJB
	private BovedaController bovedaController;

	@PostConstruct
	public void update() {

		setBovedas(bovedaController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<Boveda> getBovedas() {
		return bovedas;
	}

	public void setBovedas(List<Boveda> bovedas) {
		this.bovedas = bovedas;
	}

}

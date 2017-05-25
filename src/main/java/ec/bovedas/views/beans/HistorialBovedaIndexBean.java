package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.HistorialBovedadController;
import ec.bovedas.models.entities.HistorialBoveda;

@ManagedBean
@ViewScoped

public class HistorialBovedaIndexBean {
	
	private static final Logger LOGGER = Logger.getLogger(HistorialBovedaIndexBean.class);

	private List<HistorialBoveda> historialBoveda;

	@EJB
	
	private HistorialBovedadController historialBovedaController;

	@PostConstruct
	public void update() {
		
		setHistorialBoveda(historialBovedaController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}	

	public List<HistorialBoveda> getHistorialBoveda() {
		return historialBoveda;
	}

	public void setHistorialBoveda(List<HistorialBoveda> historialBoveda) {
		this.historialBoveda = historialBoveda;
	}	

}

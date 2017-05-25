package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import ec.bovedas.controllers.FacturaCabeceraController;
import ec.bovedas.models.entities.FacturaCabecera;

@ManagedBean
@ViewScoped
public class FacturaCabeceraIndexBean {
	
	private static final Logger LOGGER = Logger.getLogger(FacturaCabeceraIndexBean.class);

	private List<FacturaCabecera> facturaCabecera;

	@EJB
	

	private FacturaCabeceraController facturaCabeceraController;
	
	@PostConstruct
	public void update() {

		setFacturaCabecera(facturaCabeceraController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}	

	public List<FacturaCabecera> getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(List<FacturaCabecera> facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}


}

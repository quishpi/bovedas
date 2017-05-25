package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.PeriodoPrecioController;
import ec.bovedas.models.entities.PeriodoPrecio;

@ManagedBean
@ViewScoped
public class PeriodoPrecioIndexBean {

	private static final Logger LOGGER = Logger.getLogger(BovedaIndexBean.class);

	private List<PeriodoPrecio> periodoPrecio;
	@EJB
	private PeriodoPrecioController periodoPrecioController;

	@PostConstruct
	public void update() {

		setPeriodoPrecio(periodoPrecioController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<PeriodoPrecio> getPeriodoPrecio() {
		return periodoPrecio;
	}

	public void setPeriodoPrecio(List<PeriodoPrecio> periodoPrecio) {
		this.periodoPrecio = periodoPrecio;
	}

}

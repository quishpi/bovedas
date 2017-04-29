package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;
import ec.bovedas.controllers.FallecidoController;
import ec.bovedas.models.entities.Fallecido;

@ManagedBean
@ViewScoped
public class FallecidoIndexBean {

	private static final Logger LOGGER = Logger.getLogger(FallecidoIndexBean.class);

	private List<Fallecido> fallecidos;

	@EJB
	private FallecidoController fallecidoController;

	@PostConstruct
	public void update() {

		setFallecidos(fallecidoController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<Fallecido> getFallecidos() {
		return fallecidos;
	}

	public void setFallecidos(List<Fallecido> fallecidos) {
		this.fallecidos = fallecidos;
	}

}

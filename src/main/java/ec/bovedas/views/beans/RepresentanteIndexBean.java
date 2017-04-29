package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;
import ec.bovedas.controllers.RepresentanteController;
import ec.bovedas.models.entities.Representante;

@ManagedBean
@ViewScoped
public class RepresentanteIndexBean {

	private static final Logger LOGGER = Logger.getLogger(RepresentanteIndexBean.class);

	private List<Representante> representantes;

	@EJB
	private RepresentanteController representanteController;

	@PostConstruct
	public void update() {

		setRepresentantes(representanteController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<Representante> getRepresentantes() {
		return representantes;
	}

	public void setRepresentantes(List<Representante> representantes) {
		this.representantes = representantes;
	}

}

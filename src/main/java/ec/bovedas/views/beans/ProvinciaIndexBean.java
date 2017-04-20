package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.ProvinciaController;
import ec.bovedas.models.entities.Provincia;

@ManagedBean
@ViewScoped
public class ProvinciaIndexBean {

	private static final Logger LOGGER = Logger.getLogger(ProvinciaIndexBean.class);

	private List<Provincia> provincias;

	@EJB
	private ProvinciaController provinciaController;

	@PostConstruct
	public void update() {
		LOGGER.info("Init: process of ProvinciasIndexBean");
		provincias = provinciaController.listarTodo();
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

}

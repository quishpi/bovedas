package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.MausoleoController;
import ec.bovedas.models.entities.Mausoleo;

@ManagedBean
@ViewScoped
public class MausoleoIndexBean {

	private static final Logger LOGGER = Logger.getLogger(MausoleoIndexBean.class);

	private List<Mausoleo> mausoleos;

	@EJB
	private  MausoleoController mausoleoController;

	@PostConstruct
	public void update() {
		
		setMausoleos(mausoleoController.listarTodo());
		LOGGER.info("Finish: process of ProvinciasIndexBean");
	}

	public List<Mausoleo> getMausoleos() {
		return mausoleos;
	}

	public void setMausoleos(List<Mausoleo> mausoleos) {
		this.mausoleos = mausoleos;
	}	

}

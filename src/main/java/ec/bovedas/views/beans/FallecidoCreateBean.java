package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

import ec.bovedas.controllers.FallecidoController;
import ec.bovedas.controllers.RepresentanteController;
import ec.bovedas.models.entities.Fallecido;
import ec.bovedas.models.entities.Representante;
import ec.bovedas.utils.EstadoCivil;
import ec.bovedas.utils.Genero;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class FallecidoCreateBean {

	private static final Logger LOGGER = Logger.getLogger(FallecidoCreateBean.class);

	private Fallecido fallecido;
	private String criterio;
	private Representante representante;
	private Representante representanteSelected;
	private List<Representante> representantes;

	@EJB
	private FallecidoController fallecidoController;
	@EJB
	private RepresentanteController representanteController;

	@PostConstruct
	public void init() {
		fallecido = new Fallecido();
		representante = new Representante();
		representanteSelected = new Representante();
		setRepresentantes(representanteController.listarTodo());
		this.criterio = "cel";

	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = fallecidoController.guardar(fallecido, true);
		if (result == null) {
			fallecido = new Fallecido();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}

	public void guardarRepresentante() {
		String result = representanteController.guardar(representante, true);
		if (result == null) {
			representante = new Representante();
			setRepresentantes(representanteController.listarTodo());
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
			RequestContext context = RequestContext.getCurrentInstance();
			RequestContext.getCurrentInstance().update("fmrRepresentanteLista:pnlLista");
			context.execute("PF('dlgCrear').hide();");

		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}

	public Genero[] getGeneros() {
		return Genero.values();
	}

	public EstadoCivil[] getEstadoCiviles() {
		return EstadoCivil.values();
	}

	public void buscarRepresentante() {
		System.out.println("--> criterio:" + criterio);
		representantes = representanteController.listarRepresentante(criterio);
		System.out.println("--> in lista:" + representantes.size());
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Fallecido getFallecido() {
		return fallecido;
	}

	public void setFallecido(Fallecido fallecido) {
		this.fallecido = fallecido;
	}

	public Representante getRepresentanteSelected() {
		return representanteSelected;
	}

	public void setRepresentanteSelected(Representante representanteSelected) {
		this.representanteSelected = representanteSelected;
	}

	public List<Representante> getRepresentantes() {
		return representantes;
	}

	public void setRepresentantes(List<Representante> representantes) {
		this.representantes = representantes;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

}

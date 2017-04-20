package ec.bovedas.views.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.utils.MensajesTipo;

@ManagedBean
@ViewScoped
public class MensajeBean {

	private String mensaje;

	public MensajeBean() {
		mensaje = "";
	}

	public void addMsg(MensajesTipo mensajeTipo, String titulo, String mensaje) {
		String tipoAlert = "info";
		if (mensajeTipo.equals(MensajesTipo.SUCCESS)) {
			tipoAlert = "success";
		}
		if (mensajeTipo.equals(MensajesTipo.INFO)) {
			tipoAlert = "info";
		}
		if (mensajeTipo.equals(MensajesTipo.WARNING)) {
			tipoAlert = "warning";
		}
		if (mensajeTipo.equals(MensajesTipo.DANGER)) {
			tipoAlert = "danger";
		}

		setMensaje(createMsg(tipoAlert, titulo, mensaje));
	}

	private String createMsg(String tipoAlert, String titulo, String mensaje) {
		String msg = "";
		msg += "<div class=\"panel-body\">";
		msg += "<div class=\"alert alert-" + tipoAlert + "\">";
		msg += "<a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>";
		msg += "<strong>" + titulo + "</strong> " + mensaje;
		msg += "</div></div>";
		return msg;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}

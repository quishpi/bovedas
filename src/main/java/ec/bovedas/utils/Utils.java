package ec.bovedas.utils;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

import ec.bovedas.views.beans.UsuarioCreateBean;

public class Utils {

	private static final Logger LOGGER = Logger.getLogger(UsuarioCreateBean.class);

	public static void redirectToPage(String page) {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		// FacesContext.getCurrentInstance().getExternalContext().redirect("../escritorio/index.xhtml");
		try {
			context.redirect(context.getRequestContextPath() + page);
		} catch (IOException e) {
			LOGGER.error("Error Redirect: " + e.getMessage());
		}
	}

	public static RequestContext getCurrentInstance() {
		return RequestContext.getCurrentInstance();
	}

}

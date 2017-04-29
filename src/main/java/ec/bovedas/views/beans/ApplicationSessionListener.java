package ec.bovedas.views.beans;

import javax.faces.application.FacesMessage;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import ec.bovedas.utils.Mensajes;

public class ApplicationSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session Created"+se.getSession().getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println("Session Destroyed: "+session.getId());
		Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Session Destroyed");
	}

}

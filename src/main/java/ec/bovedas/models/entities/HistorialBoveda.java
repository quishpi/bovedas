package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historialBoveda")

public class HistorialBoveda {
	
	
	
	public HistorialBoveda() {
		super();
	}

	public HistorialBoveda(Boveda boveda, Fallecido fallecido, Date fechaRegistro, Date fechaExhumacion,
			String observacion, Date fechaUltimoPago) {
		super();
		this.id = null;
		this.boveda = boveda;
		this.fallecido = fallecido;
		this.fechaRegistro = fechaRegistro;
		this.fechaExhumacion = fechaExhumacion;
		this.observacion = observacion;
		this.fechaUltimoPago = fechaUltimoPago;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Boveda boveda;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Fallecido fallecido;
	
	@Column(name = "fechaRegistro", unique = false, nullable = false, length = 50)
	private Date fechaRegistro;
	
	@Column(name = "fechaExhumacion", unique = false, nullable = false, length = 50)
	private Date fechaExhumacion;
	
	@Column(name = "observacion", unique = false, nullable = false, length = 500)
	private String observacion;
	
	@Column(name = "fechaUltimoPago", unique = false, nullable = false, length = 50)
	private Date fechaUltimoPago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boveda getBoveda() {
		return boveda;
	}

	public void setBoveda(Boveda boveda) {
		this.boveda = boveda;
	}

	public Fallecido getFallecido() {
		return fallecido;
	}

	public void setFallecido(Fallecido fallecido) {
		this.fallecido = fallecido;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaExhumacion() {
		return fechaExhumacion;
	}

	public void setFechaExhumacion(Date fechaExhumacion) {
		this.fechaExhumacion = fechaExhumacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getFechaUltimoPago() {
		return fechaUltimoPago;
	}

	public void setFechaUltimoPago(Date fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}

	@Override
	public String toString() {
		return "HistorialBoveda [id=" + id + ", boveda=" + boveda + ", fallecido=" + fallecido + ", fechaRegistro="
				+ fechaRegistro + ", fechaExhumacion=" + fechaExhumacion + ", observacion=" + observacion
				+ ", fechaUltimoPago=" + fechaUltimoPago + "]";
	}

}

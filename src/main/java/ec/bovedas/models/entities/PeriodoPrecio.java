package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ec.bovedas.utils.TipoBoveda;

@Entity
@Table(name = "periodoPrecio")

public class PeriodoPrecio {

	public PeriodoPrecio() {
		super();
	}

	public PeriodoPrecio(String nombre, Date fechaInicial, Date fechaFinal, TipoBoveda tipoBoveda, Double precio,
			Boolean estado, Double porcentajeIva) {
		super();
		this.id = null;
		this.nombre = nombre;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.tipoBoveda = tipoBoveda;
		this.precio = precio;
		this.estado = estado;
		this.porcentajeIva = porcentajeIva;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "nombre", unique = true, nullable = false, length = 100)
	private String nombre;

	@Column(name = "fechaInicial", unique = false, nullable = false, length = 50)
	private Date fechaInicial;

	@Column(name = "fechaFinal", unique = false, nullable = false, length = 50)
	private Date fechaFinal;

	private TipoBoveda tipoBoveda;

	@Column(name = "precio", nullable = false)
	private Double precio = 0.0;

	@Column(name = "estado", nullable = false)
	private Boolean estado = false;

	@Column(name = "porcentajeIva", nullable = false)
	private Double porcentajeIva = 0.0;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public TipoBoveda getTipoBoveda() {
		return tipoBoveda;
	}

	public void setTipoBoveda(TipoBoveda tipoBoveda) {
		this.tipoBoveda = tipoBoveda;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Double getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(Double porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	@Override
	public String toString() {
		return "PeriodoPrecio [id=" + id + ", nombre=" + nombre + ", fechaInicial=" + fechaInicial + ", fechaFinal="
				+ fechaFinal + ", tipoBoveda=" + tipoBoveda + ", precio=" + precio + ", estado=" + estado
				+ ", porcentajeIva=" + porcentajeIva + "]";
	}

}

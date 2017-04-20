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
@Table(name = "facturaCabecera")
public class FacturaCabecera {
	
	
	public FacturaCabecera() {
		super();
	}

	public FacturaCabecera(Representante representante, Date fechaPago, Double subtotalConIva,
			Double subtotalIva0, Double valorIva, Double valorExoneracion, Double total) {
		super();
		this.id = null;
		this.representante = representante;
		this.fechaPago = fechaPago;
		this.subtotalConIva = subtotalConIva;
		this.subtotalIva0 = subtotalIva0;
		this.valorIva = valorIva;
		this.valorExoneracion = valorExoneracion;
		this.total = total;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Representante representante;
	
	@Column(name = "fechaPago", unique = false, nullable = false, length = 50)
	private Date fechaPago;
	
	@Column(name = "subtotalConIva", nullable = false)
	private Double subtotalConIva = 0.0;
	
	@Column(name = "subtotalIva0", nullable = false)
	private Double subtotalIva0 = 0.0;
	
	@Column(name = "valorIva", nullable = false)
	private Double valorIva = 0.0;
	
	@Column(name = "valorExoneracion", nullable = false)
	private Double valorExoneracion = 0.0;
	
	@Column(name = "total", nullable = false)
	private Double total = 0.0;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Double getSubtotalConIva() {
		return subtotalConIva;
	}

	public void setSubtotalConIva(Double subtotalConIva) {
		this.subtotalConIva = subtotalConIva;
	}

	public Double getSubtotalIva0() {
		return subtotalIva0;
	}

	public void setSubtotalIva0(Double subtotalIva0) {
		this.subtotalIva0 = subtotalIva0;
	}

	public Double getValorIva() {
		return valorIva;
	}

	public void setValorIva(Double valorIva) {
		this.valorIva = valorIva;
	}

	public Double getValorExoneracion() {
		return valorExoneracion;
	}

	public void setValorExoneracion(Double valorExoneracion) {
		this.valorExoneracion = valorExoneracion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "FacturaCabecera [id=" + id + ", representante=" + representante + ", fechaPago=" + fechaPago
				+ ", subtotalConIva=" + subtotalConIva + ", subtotalIva0=" + subtotalIva0 + ", valorIva=" + valorIva
				+ ", valorExoneracion=" + valorExoneracion + ", total=" + total + "]";
	}
	
		
}

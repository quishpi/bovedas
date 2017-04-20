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
@Table(name = "facturaDetalle")

public class FacturaDetalle {
	
		
	public FacturaDetalle() {
		super();
	}

	public FacturaDetalle(FacturaCabecera facturaCabecera, HistorialBoveda historialBoveda,
			Date fechaInicial, Date fechaFinal, Double valor) {
		super();
		this.id = null;
		this.facturaCabecera = facturaCabecera;
		this.historialBoveda = historialBoveda;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.valor = valor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private FacturaCabecera facturaCabecera;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private HistorialBoveda historialBoveda;
	
	@Column(name = "fechaInicial", unique = false, nullable = false, length = 50)
	private Date fechaInicial;
	
	@Column(name = "fechaFinal", unique = false, nullable = false, length = 50)
	private Date fechaFinal;
	
	@Column(name = "valor", nullable = false)
	private Double valor = 0.0;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	public HistorialBoveda getHistorialBoveda() {
		return historialBoveda;
	}

	public void setHistorialBoveda(HistorialBoveda historialBoveda) {
		this.historialBoveda = historialBoveda;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [id=" + id + ", facturaCabecera=" + facturaCabecera + ", historialBoveda="
				+ historialBoveda + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", valor=" + valor
				+ "]";
	}
	
		

}

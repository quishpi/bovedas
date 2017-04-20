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
@Table(name = "contrato")


public class Contrato {
	
	public Contrato() {
		super();
	}


	public Contrato( Representante representante, Boveda boveda, Date fechaContrato,
			FacturaCabecera facuraCabecera, String presidente, String textoCompleto) {
		super();
		this.id = null;
		this.representante = representante;
		this.boveda = boveda;
		this.fechaContrato = fechaContrato;
		this.facuraCabecera = facuraCabecera;
		this.presidente = presidente;
		this.textoCompleto = textoCompleto;
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Representante representante;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Boveda boveda;
	
	@Column(name = "fechaContrato", unique = false, nullable = false, length = 50)
	private Date fechaContrato;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private FacturaCabecera facuraCabecera;
	
	@Column(name = "presidente", unique = false, nullable = false, length = 50)
	private String presidente;
	
	
	@Column(name = "textoCompleto", unique = false, nullable = false, length = 500)
	private String textoCompleto;


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


	public Boveda getBoveda() {
		return boveda;
	}


	public void setBoveda(Boveda boveda) {
		this.boveda = boveda;
	}


	public Date getFechaContrato() {
		return fechaContrato;
	}


	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}


	public FacturaCabecera getFacuraCabecera() {
		return facuraCabecera;
	}


	public void setFacuraCabecera(FacturaCabecera facuraCabecera) {
		this.facuraCabecera = facuraCabecera;
	}


	public String getPresidente() {
		return presidente;
	}


	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}


	public String getTextoCompleto() {
		return textoCompleto;
	}


	public void setTextoCompleto(String textoCompleto) {
		this.textoCompleto = textoCompleto;
	}


	@Override
	public String toString() {
		return "Contrato [id=" + id + ", representante=" + representante + ", boveda=" + boveda + ", fechaContrato="
				+ fechaContrato + ", facuraCabecera=" + facuraCabecera + ", presidente=" + presidente
				+ ", textoCompleto=" + textoCompleto + "]";
	}
	
		
	

}

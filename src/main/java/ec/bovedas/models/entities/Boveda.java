package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.bovedas.utils.Estado;
import ec.bovedas.utils.EstadoFisico;
import ec.bovedas.utils.TipoBoveda;

@Entity
@Table(name = "boveda")
public class Boveda {
	
	
	
	public Boveda() {
		super();
	}

	public Boveda(Integer numero, Mausoleo mausoleo, Integer fila, Integer columna, Estado estado,
			TipoBoveda tipoBoveda, EstadoFisico estadoFisico) {
		super();
		this.id = null;
		this.numero = numero;
		this.mausoleo = mausoleo;
		this.fila = fila;
		this.columna = columna;
		this.estado = estado;
		this.tipoBoveda = tipoBoveda;
		this.estadoFisico = estadoFisico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "numero", unique = false, nullable = false)
	private Integer numero;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Mausoleo mausoleo;
	
	@Column(name = "fila", nullable = false)
	private Integer fila;
	
	@Column(name = "columna", nullable = false)
	private Integer columna;
	
	@Column(name = "estado", nullable = false)
	private Estado estado ;
	
	@Column(name = "tipoBoveda", nullable = false)
	private TipoBoveda tipoBoveda;
	
	@Column(name = "estadoFisico", nullable = false)
	private EstadoFisico estadoFisico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Mausoleo getMausoleo() {
		return mausoleo;
	}

	public void setMausoleo(Mausoleo mausoleo) {
		this.mausoleo = mausoleo;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Integer getColumna() {
		return columna;
	}

	public void setColumna(Integer columna) {
		this.columna = columna;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoBoveda getTipoBoveda() {
		return tipoBoveda;
	}

	public void setTipoBoveda(TipoBoveda tipoBoveda) {
		this.tipoBoveda = tipoBoveda;
	}

	public EstadoFisico getEstadoFisico() {
		return estadoFisico;
	}

	public void setEstadoFisico(EstadoFisico estadoFisico) {
		this.estadoFisico = estadoFisico;
	}

	@Override
	public String toString() {
		return "Boveda [id=" + id + ", numero=" + numero + ", mausoleo=" + mausoleo + ", fila=" + fila + ", columna="
				+ columna + ", estado=" + estado + ", tipoBoveda=" + tipoBoveda + ", estadoFisico=" + estadoFisico
				+ "]";
	}
	
}

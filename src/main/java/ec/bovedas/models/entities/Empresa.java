package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	
	public Empresa() {
		super();
	}

	public Empresa( String ruc, String nombre, String direccion, String telefono, byte[] logo, String email,
			String url, Parroquia parroquia) {
		super();
		this.id = null;
		this.ruc = ruc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.logo = logo;
		this.email = email;
		this.url = url;
		this.parroquia = parroquia;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "ruc", unique = true, nullable = false, length = 13)
	private String ruc;
	
	@Column(name = "nombre", unique = false, nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "direccion", unique = false, nullable = true, length = 100)
	private String direccion;
	
	@Column(name = "telefono", unique = false, nullable = true, length = 100)
	private String telefono;
	
	@Column(name = "logo", unique = false)
	private byte[] logo;
	
	@Column(name = "email", unique = false, nullable = true, length = 100)
	private String email;
	
	@Column(name = "url", unique = false, nullable = true, length = 100)
	private String url;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = true)
	private Parroquia parroquia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}
	
	
	
}

package ec.bovedas.utils;

public enum EstadoPrecio {
	LIBRE("Activo"), OCUPADO("Inactivo");
	private String description;

	private EstadoPrecio(String description) {
		this.description = description;
	}

	public String getEstadoPrecio() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}

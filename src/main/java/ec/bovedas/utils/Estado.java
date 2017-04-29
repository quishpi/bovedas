package ec.bovedas.utils;

public enum Estado {
	LIBRE("Libre"), OCUPADO("Ocupado");
	private String description;

	private Estado(String description) {
		this.description = description;
	}

	public String getEstado() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}

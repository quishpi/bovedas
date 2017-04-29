package ec.bovedas.utils;

public enum EstadoFisico {
	BUENO("Bueno"), REGULAR("Regular"), MALO("Malo"), DESTRUIDO("Destruido");
	private String description;

	private EstadoFisico(String description) {
		this.description = description;
	}

	public String getEstadoFisico() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}

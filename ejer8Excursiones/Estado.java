package oo1.ej9Excursiones002;

public abstract class Estado {
	private Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public Excursion getExcursion() {
		return this.excursion;
	}
	
	public abstract void inscribirUsuario(Usuario usuario);
	
	public abstract String obtenerInformarcion();
}

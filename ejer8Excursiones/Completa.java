package oo1.ej9Excursiones002;

public class Completa extends Estado{
	
	public Completa(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().getEnEspera().add(usuario);
	}
	
	public String obtenerInformarcion() {
		return this.getExcursion().obtenerInformacion();
	}
}

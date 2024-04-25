package oo1.ej9Excursiones002;

public class Provisoria extends Estado{
	
	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().getInscriptos().add(usuario);
		if (this.getExcursion().alcanzoMinimo()) {
			this.getExcursion().setState(new Definitiva(this.getExcursion()));
		}
	}
	
	public String obtenerInformarcion() {
		return this.getExcursion().obtenerInformacion() + (this.getExcursion().getCupoMaximo() - this.getExcursion().getInscriptos().size());
	}
	

}

package oo1.ej9Excursiones002;

public class Definitiva extends Estado{
	
	public Definitiva(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().getInscriptos().add(usuario);
		if(this.getExcursion().alcanzoMaximo()) {
			this.getExcursion().setState(new Completa(this.getExcursion()));
		}
	}
	
	public String obtenerInformarcion() {
		return this.getExcursion().obtenerInformacion() + "Mails usuarios: " + this.getExcursion().getMailsUsuarios() 
				+ "faltan: " + (this.getExcursion().getCupoMaximo() - this.getExcursion().getInscriptos().size());
	}

}

package oo1.ej19JuegosDeRolOO2;

public abstract class Builder {
	protected Personaje personaje;
	
	public Personaje getPersonaje() {
		return this.personaje;
	}
	
	public abstract void construirNombre(String nombre);
	public abstract Arma construirArma();
	public abstract Armadura construirArmadura();
	
	
}

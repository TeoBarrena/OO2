package oo1.ej19JuegosDeRolOO2;

public class GuerreroBuilder extends Builder{

	public void construirNombre(String nombre) {
		this.personaje = new Guerrero(nombre, this.construirArmadura(),this.construirArma());
	}
	
	public Arma construirArma() {
		return new Espada();
	}
	
	public Armadura construirArmadura() {
		return new ArmaduraDeAcero();
	}
}

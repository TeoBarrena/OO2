package oo1.ej19JuegosDeRolOO2;

public class ThoorBuilder extends Builder{
	
	public void construirNombre(String nombre) {
		this.personaje = new Thoor(nombre,this.construirArmadura(), this.construirArma());
	}
	
	public Arma construirArma() {
		return new Martillo();
	}
	
	public Armadura construirArmadura() {
		return new ArmaduraDeHierro();
	}
}

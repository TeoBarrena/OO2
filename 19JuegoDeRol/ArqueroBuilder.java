package oo1.ej19JuegosDeRolOO2;

public class ArqueroBuilder extends Builder{
	
	public void construirNombre(String nombre) {
		this.personaje = new Arquero(nombre, this.construirArmadura(),this.construirArma());
	}
	
	public Arma construirArma() {
		return new Arco();
	}
	
	public Armadura construirArmadura() {
		return new ArmaduraDeCuero();
	}
}

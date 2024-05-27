package oo1.ej19JuegosDeRolOO2;

public class MagoBuilder extends Builder{
	
	public void construirNombre(String nombre) {
		this.personaje =  new Mago(nombre, this.construirArmadura(), this.construirArma());
	}
	
	public Arma construirArma() {
		return new BastonMagico();
	}
	
	public Armadura construirArmadura() {
		return new ArmaduraDeCuero();
	}

}

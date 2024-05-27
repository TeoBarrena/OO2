package oo1.ej19JuegosDeRolOO2;

public abstract class Arma {
	protected int [] danio;
	
	public int getDanio(Armadura armadura) {
		return danio[armadura.getDefensa()];
	}
}

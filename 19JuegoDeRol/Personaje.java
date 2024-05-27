package oo1.ej19JuegosDeRolOO2;

public abstract class Personaje {
	protected String nombre;
	protected int vida = 100;
	protected Armadura armadura;
	protected Arma arma;
	
	public Personaje(String nombre, Arma arma, Armadura armadura) {
		this.nombre = nombre;
		this.arma = arma;
		this.armadura = armadura;
	}
	
	public boolean isAlive() {
		return this.vida > 0;
	}
	
	public String pelearContra(Personaje enemigo) {
		if (isAlive()) {
			int danio = this.arma.getDanio(enemigo.getArmadura());
			enemigo.vida -= Math.max(danio, 0);
			return this.nombre + " ataca a " + enemigo.nombre + " y causa " + danio + " de daño";
		}
		return "Este personaje esta muerto";
	}
	
	public Armadura getArmadura() {
		return this.armadura;
	}
	
	public int getVida() {
		return this.vida;
	}
}

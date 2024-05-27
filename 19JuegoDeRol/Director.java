package oo1.ej19JuegosDeRolOO2;

public class Director {
	private Builder builder;
	
	public Director() {
		
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Personaje construirPersonaje(String nombre) {
		this.builder.construirNombre(nombre);
		return this.builder.getPersonaje();
	}

}

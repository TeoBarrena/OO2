package oo1.ej9Excursiones002;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private Estado state;
 	
	Excursion(String nombre,LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro,
			double costo, int cupoMinimo, int cupoMaximo){
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<Usuario>();
		this.enEspera= new ArrayList<Usuario>();
		this.state = new Provisoria(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public void setState(Estado state) {
		this.state = state;
	}
	
	public void inscribirUsuario(Usuario usuario) {
		this.state.inscribirUsuario(usuario);
	}
	
	public boolean alcanzoMinimo() {
		return this.inscriptos.size() == this.cupoMinimo;
	}
	
	public boolean alcanzoMaximo() {
		return this.inscriptos.size() == this.cupoMaximo;
	}
	
	public String obtenerInformacion() {
		return "Excursion " +this.getNombre() + "cuesta: " + this.getCosto()+
				"empieza: " + this.getFechaInicio() + "termina: " + this.getFechaFin()+
				"punto de encuentro: " + this.getPuntoEncuentro();
	}
	
	public String getMailsUsuarios(){
		return this.inscriptos.stream().map(inscripto -> inscripto.getMail()).reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
	
	public List<Usuario> getInscriptos(){
		return this.inscriptos;
	}
	
	public List<Usuario> getEnEspera(){
		return this.enEspera;
	}
	
}

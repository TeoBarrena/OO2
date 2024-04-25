package oo1.ej7FileSystemOO2;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem{
	private int tamano;
	
	public Archivo(String nombre, LocalDate fechaCreacion,int tamano) {
		super(nombre,fechaCreacion);
		this.tamano = tamano;
	}
	
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamano();
	}
	
	public int  getTamano() {
		return this.tamano;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public FileSystem buscar(String nombre){
		return null;
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		return null;
	}
	
	public String listadoDeContenido() {
		return null;
	}
}

package oo1.ej7FileSystemOO2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem{
	private List<FileSystem> files;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre,fechaCreacion);
		this.files = new ArrayList<>();
	}
	
	//diciendo que recibe un parametro de tipo FileSystem doy la chance a que sea directorio o archivo
	public void addFile(FileSystem file) {
		this.files.add(file);
	}
	
	public int tamanoTotalOcupado() {
		return this.files.stream().mapToInt(file -> file.tamanoTotalOcupado()).sum() + 32;
	}
	
	public Archivo archivoMasGrande() {
		return this.files.stream().map(file -> file.archivoMasGrande()).max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.files.stream().map(file -> file.archivoMasNuevo()).max((a1,a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	}
	
	public FileSystem buscar(String nombre){
		return this.files.stream().findFirst().filter(file -> file.getNombre().equals(nombre)).orElse(null);
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		return this.files.stream().filter(file -> file.getNombre().equals(nombre)).collect(Collectors.toList());
	}
	
	public String listadoDeContenido() {
	    StringBuilder result = new StringBuilder();
	    listadoDeContenidoRecursivo(result, this, "");
	    return result.toString();
	}

	private void listadoDeContenidoRecursivo(StringBuilder result, FileSystem fileSystem, String path) {
	    result.append(path).append("/").append(fileSystem.getNombre()).append("\n");
	    if (fileSystem instanceof Directorio) {
	        for (FileSystem file : ((Directorio) fileSystem).files) {
	            listadoDeContenidoRecursivo(result, file, path + "/" + fileSystem.getNombre());
	        }
	    }
	}
	
	/*Esta sentencia es un bucle for mejorado (enhanced for loop) que itera sobre los elementos de una colección. Aquí hay una explicación detallada:

	1.((Directorio) fileSystem): Esto convierte el objeto fileSystem, que es del tipo FileSystem, a un objeto de tipo Directorio. Esto se hace para poder acceder a la lista de archivos
	 (files) dentro del directorio.
	
	2.files: Accede a la lista de archivos contenidos dentro del directorio. Este es un atributo de la clase Directorio.
	
	3.for (FileSystem file : ... ): Itera sobre cada elemento en la lista de archivos del directorio. El tipo de objeto FileSystem se usa como el tipo de iteración y file 
	es una variable que representa cada elemento en la lista.
	
	Entonces, en resumen, esta sentencia itera sobre todos los archivos dentro del directorio fileSystem, permitiendo que se realicen operaciones en cada archivo durante cada iteración del bucle.
	 * 
	 * 
	 */
	
}

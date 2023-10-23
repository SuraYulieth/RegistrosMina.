package minas;

public class Empleado {
	//Encapsulado
	protected int hMinimas = 8;
	protected String nombre;
	protected String id;
	
	public Empleado () {
	}
	
	public Empleado (int hMinimas, String nombre, String id) {
		this.hMinimas = hMinimas;
		this.nombre = nombre;
		this.id = id;
	}
	
	public void setHMinimas(int hMinimas) {
		this.hMinimas = hMinimas;
	}
	
	public int getHMinimas() {
		return hMinimas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId () {
		return id;
	}
	//Polimorfismo
	//Método que se sobreescribe en la clase hija novedades
	public String Imprimir_información () {
		return "El empleado " + nombre + " identificado con el ID " + id;
	}
}


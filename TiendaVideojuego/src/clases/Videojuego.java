package clases;

public class Videojuego {

	private String codigo;
	private String nombre;
	private int ventas;
	private int edadMinima;
	
	//Getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	//Constructores
	public Videojuego(String codigo, String nombre, int ventas, int edadMinima) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ventas = ventas;
		this.edadMinima = edadMinima;
	}
	public Videojuego() {
		super();
	}
	
	
}

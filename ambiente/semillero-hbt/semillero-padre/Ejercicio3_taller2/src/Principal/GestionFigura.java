package Principal;

public abstract class GestionFigura {
	private int countAristas;
	private String nombre;
	private String color;
	
	
	public GestionFigura(int countAristas,String color,String nombre) {
		super();
		this.countAristas=countAristas;
		this.color=color;
		this.nombre=nombre;
	}
	
	
	public abstract String graficar();
	
	public int getAristas() {
		return countAristas;
	}
	
	public String getColor() {
		return color;
		
	}
	public String getNombre() {
		return nombre;
	}
}

package Principal;

/**
 * @author Juan Pablo Cano Jaramillo
 * Definicion de la clase padre Figura
 */
public abstract class Figura {

private String color;
private int conteoAristas;
public Figura(String color, int conteoAristas) {
	super();
	this.conteoAristas=conteoAristas;
	this.color=color;
}
public abstract String dibujar();


public int getAristas() {
	return conteoAristas;
	
}
/*public void setColor(String color) {
	this.color=color;
}
*/
public String getColor() {
	return color;
}
}




 


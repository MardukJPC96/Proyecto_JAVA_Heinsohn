package Principal;

public class Circulo extends Figura {

	public Circulo(String color, int conteoAristas) {
		super(color, conteoAristas);
		
	}

	@Override
	public String dibujar() {
		
		return "Se esta dibujando un circulo";
	}
}

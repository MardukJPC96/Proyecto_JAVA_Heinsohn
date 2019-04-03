package Principal;

public class EjecucionApp {

	public static void main(String[] args) {
		Circulo circulo=new Circulo(0,"Verde","Primer Circulo",4.5);
		Rectangulo rectangulo=new Rectangulo(4,"rojo","rectangulo",4.5,7);
		
		System.out.println(circulo.graficar());
		System.out.println("Nombre: "+circulo.obtenerNombreFigura());
		System.out.println("Area: "+circulo.calcularArea());
		System.out.println("Perimetro: "+circulo.calcularPerimetro());
		System.out.println("-------------");
		System.out.println(rectangulo.graficar());
		System.out.println("Nombre: "+rectangulo.obtenerNombreFigura());
		System.out.println("Area: "+rectangulo.calcularArea());
		System.out.println("Perimetro: "+rectangulo.calcularPerimetro());
		
	}

}

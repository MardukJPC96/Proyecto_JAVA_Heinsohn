package Principal;

/**
 * Apartado de ejecucion de calculos
 * 
 *
 */
public class PruebaFigura {

	public static void main(String[] args) {
		// punteros
		Circulo circulo=new Circulo(0,"Verde","Primer Circulo",8);
		Rectangulo rectangulo=new Rectangulo(4,"rojo","rectangulo",7.5,12);
		
		
		
		System.out.println(circulo.graficar());
		System.out.println("Nombre: "+circulo.obtenerNombreFigura());
		System.out.println("Perimetro: "+circulo.calcularPerimetro());
		System.out.println("Area: "+circulo.calcularArea());
		
	
		System.out.println("-------------");
		// Graficacion y calculo del rectangulo
		System.out.println(rectangulo.graficar());
		System.out.println("Nombre: "+rectangulo.obtenerNombreFigura());
		System.out.println("Perimetro: "+rectangulo.calcularPerimetro());
		System.out.println("Area: "+rectangulo.calcularArea());
		
		
	}

}

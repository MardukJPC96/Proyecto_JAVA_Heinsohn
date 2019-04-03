package Principal;

/**
 * Apartado de ejecucion 
 *  
 */
public class EjecucionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura circulo =new Circulo("rojo",0);
		Figura cuadrado=new Cuadrado("verde",4);
		Figura triangulo=new Triangulo("morado",3);
		
		Figura[] figuras=new Figura[3];
		figuras[0]=circulo;
		figuras[1]=cuadrado;
		figuras[2]=triangulo;
		
		for (Figura figura:figuras) {
			System.out.println(figura.dibujar());
			System.out.println("Tiene: "+figura.getAristas()+" aristas");
			System.out.println("color: "+figura.getColor());
			
		}
	}

}

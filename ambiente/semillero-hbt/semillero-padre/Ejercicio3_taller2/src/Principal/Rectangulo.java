package Principal;

public class Rectangulo extends GestionFigura implements InterfaceGeo {
	private double alto;
	private double ancho;
	
	public Rectangulo(int countAristas, String color, String nombre,double alto, double ancho) {
		super(countAristas, color, nombre);
		this.alto=alto;
		this.ancho=ancho;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String graficar() {
		// TODO Auto-generated method stub
		return "dibujando rectangulo";
	}

	@Override
	public String obtenerNombreFigura() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getAlto()*getAncho();
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*getAlto()*getAncho();
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto=alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho=ancho;
		}
	
	

}

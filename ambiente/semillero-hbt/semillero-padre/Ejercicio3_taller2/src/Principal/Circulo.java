package Principal;
import java.lang.Math;

public class Circulo extends GestionFigura implements InterfaceGeo {
	private double radio;
	public Circulo(int countAristas, String color, String nombre,double radio) {
		super(countAristas, color, nombre);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String graficar() {
		// TODO Auto-generated method stub
		return "dibujando un circulo";
	}

	@Override
	public String obtenerNombreFigura() {
		// TODO Auto-generated method stub
		return this.getNombre();
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getRadio()*getRadio();
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
}

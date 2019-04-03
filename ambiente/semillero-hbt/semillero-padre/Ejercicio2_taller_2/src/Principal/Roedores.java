package Principal;
/**
 * @author Juan Pablo Cano Jaramillo
 * Definicion de la clase padre Figura
 */
public abstract class Roedores {
	private String tipos;
	private String dieta;
   public Roedores(String tipos,String dieta) {
	super();
	this.tipos=tipos;
	this.dieta=dieta;
	   
}
  public abstract String comportamiento();
  
  public String getTipos() {
	  return tipos;
  }
  public String getDietas() {
	  return dieta;
  }
  
  
}

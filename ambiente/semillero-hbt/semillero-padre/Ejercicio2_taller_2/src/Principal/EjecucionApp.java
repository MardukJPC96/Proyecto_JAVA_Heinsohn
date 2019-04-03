package Principal;

public class EjecucionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roedores hamster=new Hamster("Citadino y Casero","Omnivoro");
		Roedores jerbo=new Jerbo("De campo y Casero","Forraje mezclado");
		Roedores ratoncampo=new RatonCampo("De campo y Madrigueras","Omnivoro");
	    Roedores rata=new Rata("Madrigeras y Ciudad","Omnivoro");
		
		Roedores[] roedores=new Roedores[4];
		roedores[0]=hamster;
		roedores[1]=jerbo;
	    roedores[2]=ratoncampo;
	    roedores[3]=rata;
	    
	    for(Roedores roedor:roedores) {
	    	System.out.println(roedor.comportamiento());
	    	System.out.println("Su tipo es: "+roedor.getTipos());
	    	System.out.println("Su dieta es: "+roedor.getDietas());
	    }
	}

}

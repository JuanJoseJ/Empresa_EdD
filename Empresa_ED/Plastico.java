package Empresa_ED;

public class Plastico extends Pieza{

	public Plastico(double peso, String codigo){
		super(peso,codigo, "plastico");
	}

	//Este es el metodo para setear el costo de esta pieza
	public void calcular_costo() {
		setCosto(1.3*peso+30);
	}	
	

}

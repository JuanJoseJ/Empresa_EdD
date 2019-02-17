package Empresa_ED;

public class Plastico extends Pieza{

	public Plastico(double peso, String codigo){
		super(peso,codigo, codigo);
	}
	
	public double costo() {
		return 1.3*peso+30;
	}	
	
	public double getCosto() {    // se va a necesitar despues para calcular el costo por solicitud
		return this.costo;
	}
}

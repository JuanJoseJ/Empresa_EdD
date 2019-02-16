package Empresa_ED;

public class Plastico extends Pieza{

	public Plastico(double peso, String codigo){
		super(peso,codigo);
	}

	public double costo() {
		return 1.3*this.peso+30;
	}

	public double getCosto(){
		return this.costo;
	}
	

}

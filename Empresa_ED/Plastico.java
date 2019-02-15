package Empresa_ED;

public class Plastico extends Pieza{

	public Plastico(double peso, String codigo){
		super(peso,codigo);
	}

	public void costo() {
		this.costo= 1.3*this.peso+30;
	}

	public double getCosto(){
		return this.costo;
	}
	

}

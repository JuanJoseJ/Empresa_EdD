package Empresa_ED;

public class Metal extends Pieza{
	
	
	public Metal(double peso, String codigo){
		super(peso,codigo);
	}

	public double costo() {
		return 2.8*this.peso+56;
	}

	public double getCosto(){
		return this.costo;
	}
	
}
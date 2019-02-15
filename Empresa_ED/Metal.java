package Empresa_ED;

public class Metal extends Pieza{
	
	
	public Metal(double peso, String codigo){
		super(peso,codigo);
	}

	@Override
	public double costo() {
		return 2.8*this.peso+56;
	}
	
}
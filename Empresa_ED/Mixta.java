package Empresa_ED;

public class Mixta extends Pieza{
	protected Pieza [] piezas; 
	
	public Mixta(double peso, String codigo){
		super(peso,codigo);
	
	}
	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
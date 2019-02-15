package Empresa_ED;

public class Mixta extends Pieza{
	protected Pieza [] piezas; 
	
	public Mixta(double peso, String codigo){
		super(peso,codigo);
	
	}
	public void costo() {
		return 0;
	}

	public double getCosto(){
		return this.costo;
	}
	
}
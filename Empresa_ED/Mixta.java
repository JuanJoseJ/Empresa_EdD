package Empresa_ED;

public class Mixta extends Pieza{
	protected Pieza [] piezas; 
	
	public Mixta(double peso, String codigo){
		super(peso,codigo);
	
	}
	public double costo() {  
		double costofinal= 0;
		for(int i=0;i<piezas.length;i++) {
			costofinal+=piezas[i].getCosto();
		}
		return costofinal;
	}

	public double getCosto(){
		return this.costo;
	}
	
}

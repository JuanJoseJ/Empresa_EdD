package Empresa_ED;

public class Mixta extends Pieza{
	protected Pieza [] piezas; 
	
	public Mixta(double peso, String codigo, Pieza piezas[]){
		super(peso,codigo);
		/*double acum=0; sumatoria del precio de la pieza
		for(int i=0; i<piezas.length;i++) {
			acum+= piezas[i].getPeso();
		}
		this.peso=acum;*/
		this.piezas=piezas;
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

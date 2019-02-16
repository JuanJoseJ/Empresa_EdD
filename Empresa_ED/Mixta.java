package Empresa_ED;

public class Mixta extends Pieza{
	protected Pieza [] piezas; 
	
	public Mixta(double peso, String codigo, Pieza piezas[]){
		super(peso,codigo);
		this.piezas=piezas;
	}
	public double costo() {  
		double costofinal= 0;
		for(int i=0;i<piezas.length;i++) {
			costofinal+=piezas[i].getCosto();
		}
		return costofinal;
	}
       public  double calcularpeso() { //aplicar este metodo dentro del constructor 
		double acum=0;
		for(int i=0; i<piezas.length;i++) {
			acum+= piezas[i].getPeso();
		}
		return acum;
	}
	public double getCosto(){
		return this.costo;
	}
	
	/*
	intento de integrar el metodo
	
	private static Pieza [] p1 ;
	private static double peso = calcularpeso();
	public Mixta( String codigo, Pieza piezas[],Pieza [] p1){
		super(peso ,codigo);
		this.piezas=piezas;
		Mixta.p1 = piezas;
	}
	public double costo() {  
		double costofinal= 0;
		for(int i=0;i<piezas.length;i++) {
			costofinal+=piezas[i].getCosto();
		}
		return costofinal;
	}
       public  static double calcularpeso() {
		double acum=0;
		for(int i=0; i<p1.length;i++) {
			acum+= p1[i].getPeso();
		}
		return acum;
	}
	public double getCosto(){
		return this.costo;
	}
	*/
} 



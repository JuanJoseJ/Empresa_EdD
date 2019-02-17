package Empresa_ED;

public class Mixta extends Pieza{

	protected Pieza [] piezas; 
	//se debe aplicar una excepcion
	public Mixta(double peso, String codigo){
		super(peso,codigo, "mixta");
		this.piezas=piezas;
		setCosto(0);
		piezas=new Pieza[0];
	}

	public void calcular_costo() {
		double costofinal=0;
		for(int i=0;i<piezas.length;i++) {
			piezas[i].calcular_costo();
			costofinal+=piezas[i].getCosto();
		}
		setCosto(costofinal);
	}

	/* Si, esto no es necesario hacerlo... pues, pa que? jajaja
       public  double calcularpeso() { //aplicar este metodo dentro del constructor //NO ES NECESARIO CALCULAR EL PESO, PUES CREO
		double acum=0;
		for(int i=0; i<piezas.length;i++) {
			acum+= piezas[i].getPeso();
		}
		return acum;
	}
    /*

	
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



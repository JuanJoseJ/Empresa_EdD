package Empresa_ED;

import java.util.Arrays;

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

	// este metodo es para agregar las partes que componen la pieza mixta al vector de piezas, no se que opinen
	public void agregar_piezas(double peso, String codigo, String descripcion){
		piezas= Arrays.copyOf(piezas,piezas.length+1);
		if(descripcion == "metal" || descripcion=="Metal"){
			piezas[piezas.length-1]=new Metal(peso,codigo);
		}else if (descripcion=="plastico" || descripcion=="Plastico"){
			piezas[piezas.length-1]=new Plastico(peso,codigo);
		}else if (descripcion=="mixta" || descripcion=="Mixta"){
			piezas[piezas.length-1]=new Mixta(peso,codigo);
		}else {System.out.println("La descripcion de la pieza no es valida");}
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



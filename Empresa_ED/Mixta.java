package Empresa_ED;

import java.util.Arrays;

public class Mixta extends Pieza{

	protected Pieza [] piezas; 
	//se debe aplicar una excepcion
	public Mixta(double peso, String codigo, Pieza [] ensamble){
		super(peso,codigo, "mixta");
		this.piezas=ensamble;
		setCosto(0);
	
	}
	public Mixta(double peso, String codigo) {
		super (peso,codigo,"mixta");
	}

	public double calcular_costo() {
		double costofinal=0;
		for(int i=0;i<piezas.length;i++) {
			piezas[i].calcular_costo();
			costofinal+=piezas[i].getCosto();
		}
		 return costofinal;
	}

	// este metodo es para agregar las partes que componen la pieza mixta al vector de piezas, no se que opinen
	public void agregar_piezas(double peso, String codigo, String descripcion){
		piezas= Arrays.copyOf(piezas,piezas.length+1);
		if(descripcion == "metal" || descripcion=="Metal"){
			piezas[piezas.length-1]=new Metal(peso,codigo);
		}else if (descripcion=="plastico" || descripcion=="Plastico"){
			piezas[piezas.length-1]=new Plastico(peso,codigo);
		
		}else {System.out.println("La descripcion de la pieza no es valida");}
	}
	 public void agregar_piezas(double peso, String codigo, String descripcion, Pieza [] ensamble){
		
		 piezas[piezas.length-1]=new Plastico(peso,codigo,ensamble);
	 }

} 



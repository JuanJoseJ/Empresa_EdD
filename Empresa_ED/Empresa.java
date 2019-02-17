package Empresa_ED;

import java.util.Arrays;

public class Empresa {
	private String nombre;
	private String direccion;
	private Pieza[] piezas;
	private Cliente[] clientes;
//	private Solicitud[]	solicitudes;

	public Empresa(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		piezas= new Pieza[0];
		clientes= new Cliente[0];
		//solicitudes= new Solicitud[0];
	}

	public double Costo_Total(){
		double costo_total = 0;
		for (int i=0;i<piezas.length;i++){
			costo_total+=piezas[i].getCosto();
		}
		return costo_total;
	}

	public void Crear_Cliente(String codigo, String nombre, String direccion, String forma_De_Pago,String email){
	if (clientes == null) 
		clientes= new Cliente [1];
	else {
		clientes= Arrays.copyOf(clientes,clientes.length+1);
	}
	clientes[clientes.length-1]=new Cliente(codigo, nombre, direccion, forma_De_Pago, email);
	}


	public void Fabricar_Pieza(double peso, String codigo, String descripcion){
		piezas=Arrays.copyOf(piezas,piezas.length+1 );
		if(descripcion == "metal" || descripcion=="Metal"){
			piezas[piezas.length-1]=new Metal(peso,codigo);
		}else if (descripcion=="plastico" || descripcion=="Plastico"){
			piezas[piezas.length-1]=new Plastico(peso,codigo);
		}else if (descripcion=="mixta" || descripcion=="Mixta"){
			piezas[piezas.length-1]=new Mixta(peso,codigo);
		}else {System.out.println("La descripcion de la pieza no es valida");} //si la descripcion dada no tiene sentido, el resultado es un texto y no pasa nada jajaja

	}

}

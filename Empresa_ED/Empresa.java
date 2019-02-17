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

	public int Costo_Total(){
		return 0;

	}

	public void Crear_Cliente(String codigo, String nombre, String direccion, String forma_De_Pago,String email){
	if (clientes == null) 
		clientes= new Cliente [1];
	else {
		clientes= Arrays.copyOf(clientes,clientes.length+1);
	}
	clientes[clientes.length-1]=new Cliente(codigo, nombre, direccion, forma_De_Pago, email);
	}

	/*
	public void Fabricar_Pieza(double peso, String codigo, String descripcion){
	if (piezas == null) 
		piezas= new Pieza [1];
	else {
		piezas=Arrays.copyOf(piezas,piezas.length+1 );
	}
	piezas[piezas.length-1]=new Pieza(peso, codigo, descripcion);
	}
	*/
	public double metodoPrueba() {
		return 0;
	}
}

package Empresa_ED;

import java.util.Arrays;

public class Solicitud{
	private String nombre_cliente;
	private String codigoS;
	private String fecha;
	private Pieza[] piezas; // agrego este atributo porque en la correcion preguntan por la relacion entre la solicitud y las piezas
	private double precio;

	public Solicitud( String codigoS, String fecha, String nombre_cliente) {
		this.nombre_cliente=nombre_cliente;
		this.codigoS = codigoS; //codigo de la solicitud
		this.fecha = fecha;
		this.piezas = new Pieza[0];
		this.precio=0;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCodigoS() {
		return codigoS;
	}

	public void Calcular_precio(){
		double costo_total = 0;
		for (int i=0;i<piezas.length;i++){
			costo_total+=piezas[i].getCosto();
		}
		this.precio=costo_total;
	}
	public void Agregar_Pieza(double peso, String codigo, String descripcion){
		piezas= Arrays.copyOf(piezas,piezas.length+1 );
		if(descripcion.equals("metal" )|| descripcion.equals("Metal")){
			piezas[piezas.length-1]=new Metal(peso,codigo);
		}else if (descripcion.equals("plastico" )|| descripcion.equals("Plastico")){
			piezas[piezas.length-1]=new Plastico(peso,codigo);
		}else if (descripcion.equals("mixta" )|| descripcion.equals("Mixta")){
			piezas[piezas.length-1]=new Mixta(peso,codigo);
		}else {System.out.println("La descripcion de la pieza no es valida");} //si la descripcion dada no tiene sentido, el resultado es un texto y no pasa nada jajaja

	}
	public double Calcular_Precio(){
		double valor_total=0;
		for (int i=0;i<piezas.length;i++){
			valor_total+=piezas[i].getCosto();
		}
		return valor_total;
	}
}

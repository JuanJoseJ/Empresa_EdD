package Empresa_ED;

public class Solicitud{
	private int cantidad;
	private String codigoS;
	private String fecha;
	private Pieza[] piezas; // agrego este atributo porque en la correcion preguntan por la relacion entre la solicitud y las piezas
	
	public Solicitud(int cantidad, String codigoS, String fecha, Pieza[] piezas) {
		this.cantidad = cantidad;
		this.codigoS = codigoS;
		this.fecha = fecha;
		this.piezas = piezas;
	} 
			  
}

package Empresa_ED;

public class Solicitud{
	private int cantidad;
	private String codigoS;
	private String fecha;
	private Pieza[] piezas; // agrego este atributo porque en la correcion preguntan por la relacion entre la solicitud y las piezas
	private double precio;

	public Solicitud(int cantidad, String codigoS, String fecha) {
		this.cantidad = cantidad;
		this.codigoS = codigoS; //codigo de la solicitud
		this.fecha = fecha;
		this.piezas = new Pieza[0];
		this.precio=0;
	}

	public double getPrecio() {
		return precio;
	}

	public void Calcular_precio(){
		double costo_total = 0;
		for (int i=0;i<piezas.length;i++){
			costo_total+=piezas[i].getCosto();
		}
		this.precio=costo_total;
	}
}

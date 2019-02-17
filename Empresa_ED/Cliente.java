package Empresa_ED;

import java.util.Arrays;

public class Cliente{
	private String codigo;
	private String nombre;
	private String direccion;
	private String Forma_De_Pago;
	private String email;
	private boolean Estado_VIP;
	private Solicitud[] solicitudes;

	public Cliente(String codigo, String nombre, String direccion, String forma_De_Pago,String email) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		Forma_De_Pago = forma_De_Pago;
		this.email = email;
		Estado_VIP = false;
		solicitudes = new Solicitud[0];
	}

	public  String getCodigo(){
		return this.codigo;
	}

	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

	/*metodo para crear solicitud, primero compruebo si el arreglo es nulo sino lo es le aumento el tamaño 
	y le agrego una solicitud*/

	public void Crear_Solicitud(int cantidad, String codigoS, String fecha){
		solicitudes=Arrays.copyOf(solicitudes,solicitudes.length+1);
		solicitudes[solicitudes.length-1]=new Solicitud(cantidad,codigoS,fecha);
	}

	//el VIP no se ingresa se calcula con el cliente que mas compró
	public void setEstado_VIP(boolean estado_VIP) {
		Estado_VIP = estado_VIP;
	}
	public void cambiarestadoVIP() {
		if(Estado_VIP==true) {
			setEstado_VIP(false);
		}else {
			setEstado_VIP(true);
		}
	}

}

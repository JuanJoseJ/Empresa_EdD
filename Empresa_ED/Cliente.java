package Empresa_ED;

import jdk.nashorn.internal.runtime.ECMAException;

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

<<<<<<< Updated upstream
    public String getNombre() {
        return nombre;
    }

    public void Crear_Solicitud(String codigoS, String fecha){
		solicitudes=Arrays.copyOf(solicitudes,solicitudes.length+1);
		solicitudes[solicitudes.length-1]=new Solicitud(codigoS,fecha);
=======
	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}
	/*metodo para crear solicitud, primero compruebo si el arreglo es nulo sino lo es le aumento el tama�o 
	y le agrego una solicitud*/

	public void Crear_Solicitud(int cantidad, String codigoS, String fecha, Pieza[] piezas){
		if (solicitudes==null) 
			solicitudes= new Solicitud [1];
		else {
			solicitudes=Arrays.copyOf(solicitudes,solicitudes.length+1);
		}
		solicitudes[solicitudes.length-1]=new Solicitud(cantidad,codigoS,fecha,piezas);
	}

	public double Costo_Solicitud(){
		


	}
	
	//el VIP no se ingresa se calcula con el cliente que mas compr�
	public void setEstado_VIP(boolean estado_VIP) {
		Estado_VIP = estado_VIP;
	}
	public void cambiarestadoVIP() {
		if(Estado_VIP==true) {
			setEstado_VIP(false);
		}else {
			setEstado_VIP(true);
		}
>>>>>>> Stashed changes
	}
    public void Agregar_Pieza_Solicitud(double peso, String codigo_solicitud, String descripcion) throws EValorNoEncontrado {
	    for(int i=0;i<solicitudes.length;i++){
	        if (solicitudes[i].getCodigoS()==codigo_solicitud){
                solicitudes[i].Agregar_Pieza(peso, codigo_solicitud, descripcion);
            }else {throw new EValorNoEncontrado();}
        }
    }

<<<<<<< Updated upstream
=======

	public void crearSolicitud(int cantidad, String codigoS, String fecha, Pieza[] piezas) {
		Solicitud s= new Solicitud(cantidad,codigoS,fecha,piezas);
		//while para asignar espcacio en el arreglo
	}

	public int Forma_De_Pago(){
		switch (Forma_De_Pago){
			case 1: {
				System.out.println("Su forma de pago es: cheque ordinario");
			}
			case 2: {
				System.out.println("Su forma de pago es: cheque empresa");
			}
			case 3:{
				System.out.println("Su forma de pago es: cheque certificado");
			}
			case 4: {
				System.out.println("Su forma de pago es: transacción bancaria en línea");
			}
			defaul:{
				System.out.println("Seleccione una forma de pago válida");
			}
	}
>>>>>>> Stashed changes
}

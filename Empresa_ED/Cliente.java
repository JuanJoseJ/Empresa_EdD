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

	public void setEstado_VIP(boolean estado_VIP) {
		Estado_VIP = estado_VIP;
	}

	public  String getCodigo(){
		return this.codigo;
	}

	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

    public String getNombre() {
        return nombre;
    }

    public void Crear_Solicitud(String codigoS, String fecha){
		solicitudes=Arrays.copyOf(solicitudes,solicitudes.length+1);
		solicitudes[solicitudes.length-1]=new Solicitud(this.nombre,codigoS,fecha);
	}
    public void Agregar_Pieza_Solicitud(double peso, String codigo_solicitud, String descripcion) throws EValorNoEncontrado {
	    for(int i=0;i<solicitudes.length;i++){
	        if (solicitudes[i].getCodigoS()==codigo_solicitud){
                solicitudes[i].Agregar_Pieza(peso, codigo_solicitud, descripcion);
            }else {throw new EValorNoEncontrado();}
        }
    }

    public double Calcular_Costo_Solicitude(){
		double valor_total=0;
		for (int i=0;i<solicitudes.length;i++){
			valor_total+=solicitudes[i].Calcular_Precio();
		}
		return valor_total;
	}

}

package Empresa_ED;

public class CLiente{
	private String codigo;
	private String nombre;
	private String direccion;
	private String Forma_De_Pago;
	private String email;
	private boolean Estado_VIP;
	private Solicitud[] solicitudes;

	public CLiente(String codigo){
		this.codigo=codigo;
	}

	public  String getCodigo(){
		return this.codigo;
	}

	public Solicitud getSolicitudes(){
		return this.solicitudes;
	}

	public void Crear_Solicitud(){

	}

	public double Costo_Solicitud(){

	}


}
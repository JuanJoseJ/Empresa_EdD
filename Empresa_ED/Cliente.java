package Empresa_ED;

public class Cliente{
	private String codigo;
	private String nombre;
	private String direccion;
	private String Forma_De_Pago;
	private String email;
	private boolean Estado_VIP;
	private Solicitud[] solicitudes;

	public Cliente(String codigo){
		this.codigo=codigo;
	}

	public  String getCodigo(){
		return this.codigo;
	}
	
	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}

	public void Crear_Solicitud(){

	}

	public double Costo_Solicitud(){
		return 0;

	}


}
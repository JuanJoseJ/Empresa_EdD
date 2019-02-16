package Empresa_ED;

public class Cliente{
	private String codigo;
	private String nombre;
	private String direccion;
	private String Forma_De_Pago;
	private String email;
	private boolean Estado_VIP;
	private Solicitud[] solicitudes;

	public Cliente(String codigo, String nombre, String direccion,
		       String forma_De_Pago,String email) {
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

	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}

	public void Crear_Solicitud(){

	}

	public double Costo_Solicitud(){
		return 0;

	}
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
	public void crearSolicitud(int cantidad, String codigoS, String fecha, Pieza[] piezas) {
	   Solicitud s= new Solicitud(cantidad,codigoS,fecha,piezas);
   }
}

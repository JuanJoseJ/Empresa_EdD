package Empresa_ED;

public class Empresa {
	private String nombre;
	private String direccion;
	private Pieza[] piezas;
	private Cliente[] clientes;
	private Solicitud[]	solicitudes; //este lo pongo, porque en la correccion de los errores, ponen que nos faltan estos :)

	public Empresa(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
	}

	public int Costo_Total(){
		return 0;

	}

	public void Crear_Cliente(){

	}

	public void Fabricar_Pieza(){

	}
	
	public double metodoPrueba() {
		return 0;
	}
}

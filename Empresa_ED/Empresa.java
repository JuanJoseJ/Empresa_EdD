package Empresa_ED;

public class Empresa {
	private String nombre;
	private String direccion;
	private Pieza[] piezas;
	private Cliente[] clientes;
//	private Solicitud[]	solicitudes; //este lo pongo, porque en la correccion de los errores, ponen que nos faltan estos :)

	public Empresa(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		piezas= new Pieza[0];
		clientes= new Cliente[0];
		//solicitudes= new Solicitud[0];
	}

	public int Costo_Total(){
		return 0;

	}

	public void Crear_Cliente(){

	}
	/*
	public void Crear_Cliente(String codigo, String nombre, String direccion, String forma_De_Pago,String email){
	if (clientes == null) 
		clientes= new Cliente [1];
	else {
		cliente=Arrays.copyOf(clientes,clientes.length+1);
	}
	clientes[clientes.length-1]=new Cliente(codigo, nombre, direccion, forma_De_Pago, email);
	}*/

	public void Fabricar_Pieza(){

	}
	/*
	public void Fabricar_Pieza(){(double peso, String codigo, String descripcion){
	if (piezas == null) 
		piezas= new Pieza [1];
	else {
		cliente=Arrays.copyOf(piezas, piezas.length+1);
	}
	piezas[piezas.length-1]=new Pieza(peso, codigo, descripcion);
	}*/
	
	public double metodoPrueba() {
		return 0;
	}
}

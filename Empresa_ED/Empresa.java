package Empresa_ED;
import java.util.Arrays;
/*public static void main(String[] args) {
		Empresa pt= new Empresa("h", "gg");
		pt.Crear_Cliente("1030", "yo", "casa", "consignacion", "jgacia");
		try {
			pt.Fabricar_Pieza(40, "194", "metal");
		} catch (EValorNoEncontrado e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pt.getPiezas()[0].getCosto());
		pt.setVIP();
		System.out.println(pt.getClientes()[0].isEstado_VIP());
	}*/
/* Esta a medias
		Empresa e = new Empresa("nombre", "direccion");
		e.Crear_Cliente("codigo", "nombre", "direccion", "forma_De_Pago", "email");

		e.setVIP();
		e.Crear_Cliente("codigo1", "nombre1", "direccion", "forma_De_Pago", "email");

		for (int i = 0; i < e.getClientes().length; i++) {
			if (e.getClientes()[i].isEstado_VIP() == true) {
				System.out.println(e.getClientes()[i].getNombre());
			}else {

			}
		}

	}*/
class EValorNoEncontrado extends Exception{
	public EValorNoEncontrado() {
		super("El valor no pudo ser encontrado");
	}
}

public class Empresa {
	private String nombre;
	private String direccion;
	private Pieza[] piezas;
	private Cliente[] clientes;
	//private Solicitud[]	solicitudes;

	public Empresa(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		piezas = new Pieza[0];
		clientes = new Cliente[0];
		//solicitudes= new Solicitud[0];
	}

	public double Calcular_Costo_Clientes() {
		double valor_total=0;
		for (int i=0;i<clientes.length;i++){
			valor_total+=clientes[i].Calcular_Costo_Solicitude();
		}
		return valor_total;
	}

	public void Crear_Cliente(String codigo, String nombre, String direccion, String forma_De_Pago, String email) {
		if (clientes == null)
			clientes = new Cliente[1];
		else {
			clientes = Arrays.copyOf(clientes, clientes.length + 1);
		}
		clientes[clientes.length - 1] = new Cliente(codigo, nombre, direccion, forma_De_Pago, email);
	}


	public void Fabricar_Pieza(double peso, String codigo, String descripcion) throws EValorNoEncontrado {
		piezas = Arrays.copyOf(piezas, piezas.length + 1);
		if (descripcion.equals("metal")  || descripcion.equals("Metal")) {
			piezas[piezas.length - 1] = new Metal(peso, codigo);
		} else if (descripcion.equals("plastico" )|| descripcion.equals("Plastico")) {
			piezas[piezas.length - 1] = new Plastico(peso, codigo);
		} else if (descripcion.equals("mixta" )|| descripcion.equals("Mixta")) {
			piezas[piezas.length - 1] = new Mixta(peso, codigo);
		} else {
			throw new EValorNoEncontrado();
		} //si la descripcion dada no tiene sentido, el resultado es un texto y no pasa nada jajaja

	}

	public void crear_solicitud(String nombre_cliente, String codigo_solicitud, String fecha,int cantidad) throws EValorNoEncontrado {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNombre().equals(nombre_cliente)) //busca el cliente
				clientes[i].Crear_Solicitud(codigo_solicitud,fecha,cantidad);
			else 
				throw new EValorNoEncontrado();
		}

	}
	public void Agregar_Piezas_Solicitud(String nombre_cliente, String codigo_solicitud, double peso, String codigo_pieza, String descripcion) throws EValorNoEncontrado {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNombre().equals(nombre_cliente)) { //busca el cliente
				Fabricar_Pieza(peso,codigo_pieza,descripcion);
			} else {
				throw new EValorNoEncontrado();
			}      
		}

	}

	public void setVIP(){
		Cliente cliente_comparar=clientes[0]; //Este cliente lo uso para compararla con la que tenga el mayor precio;
		int posicion_vip=0; //este contador lo uso para saber en que posicion del vector esta el cliente que es vip
		clientes[0].setEstado_VIP(false);
		for (int i=0;i<clientes.length-1;i++){
			if(cliente_comparar.Calcular_Costo_Solicitude()<clientes[i+1].Calcular_Costo_Solicitude()){
				cliente_comparar=clientes[i+1];
				posicion_vip=i+1;
			}
			clientes[i].setEstado_VIP(false);
		}
		clientes[posicion_vip].setEstado_VIP(true);
	}
	public Pieza[] getPiezas() {
		return piezas;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

}

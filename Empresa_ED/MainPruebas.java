package Empresa_ED;

public class MainPruebas {

	public static void main(String[] args) throws EValorNoEncontrado {
		// TODO Auto-generated method stub

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
		
	}
		
	}



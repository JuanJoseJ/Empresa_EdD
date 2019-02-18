package Empresa_ED;

public class MainPruebas {

	public static void main(String[] args) throws EValorNoEncontrado {
		// TODO Auto-generated method stub

		Empresa e = new Empresa("Empresota","Calle 10");
		
		e.Crear_Cliente("12312", "JJ", "Calle 6", "Electronica", "jj@email.com");
		e.Crear_Cliente("3123", "AA", "Calle 8", "Cheque", "aa@email.com");
		
		
		
		e.crear_solicitud("JJ", "fjq", "01,01,19");
		
		e.crear_solicitud("AA", "uyt", "01,01,19");
		
		e.Agregar_Piezas_Solicitud("JJ", "fjq", 32,"qwe", "metal");
		e.Agregar_Piezas_Solicitud("AA", "uyt", 42, "ewq", "mixta");
		e.Agregar_Piezas_Solicitud("AA", "uyt", 22, "ftr", "plastico");
	
		e.setVIP();
		
		
		
	}

}

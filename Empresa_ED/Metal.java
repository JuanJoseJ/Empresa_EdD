package Empresa_ED;

public class Metal extends Pieza{

	public Metal(double peso, String codigo, String descripcion) {
		super(peso, codigo, descripcion);
		// si descripcion se refiere a que tipo de pieza entonces el constructor deberia ser asi super(peso,codigo,"Metal")
		// TODO Auto-generated constructor stub
	}
	public void calcular_costo() {
		setCosto(2.8*peso+56);
	}

}

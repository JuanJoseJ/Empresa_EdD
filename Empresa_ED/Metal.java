package Empresa_ED;

public class Metal extends Pieza{

	public Metal(double peso, String codigo) {
		super(peso, codigo, "metal");
	}
	public double calcular_costo() {
		 return (2.8*peso+56);
	}

}

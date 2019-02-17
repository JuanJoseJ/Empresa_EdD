package Empresa_ED;

public class Metal extends Pieza{

	public Metal(double peso, String codigo) {
		super(peso, codigo, "metal");
	}
	public void calcular_costo() {
		setCosto(2.8*peso+56);
	}

}

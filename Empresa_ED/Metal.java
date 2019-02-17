package Empresa_ED;

public class Metal extends Pieza{
	
	public Metal(double peso, String codigo, String descripcion) {
		super(peso, codigo, descripcion);
		// TODO Auto-generated constructor stub
	}
	public double costo() {
		return 2.8*peso+56;
	}
}
package Empresa_ED;

abstract class Pieza{
	private double peso;
	private double costo;
	private String codigo;

	abstract public double costo();
	//hey, no se si este constructor si va, peo rme hace falta para hacer las clases a las que se extiende
	public Pieza(double peso, String codigo){
		this.peso=peso;
		this.codigo=codigo;
	}
}
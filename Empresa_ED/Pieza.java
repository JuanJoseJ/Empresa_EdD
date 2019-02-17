package Empresa_ED;

abstract class Pieza{
	protected double peso;
	protected String codigo;
	protected String descripcion;

	abstract public double costo();
	//hey, no se si este constructor si va, peo rme hace falta para hacer las clases a las que se extiende
	public Pieza(double peso, String codigo, String descripcion){
		this.peso=peso;
		this.codigo=codigo;
		this.descripcion=descripcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public String getCodigo() {
		return codigo;
	}
      
	
}

package Empresa_ED;

abstract class Pieza{
	protected double peso;
	protected String codigo;
	protected String descripcion;
	protected  double costo;

	abstract public double calcular_costo();

	public Pieza(double peso, String codigo, String descripcion){
		this.peso=peso;
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.costo=calcular_costo();
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
	public void setCosto(double costo){this.costo=costo; }
	public double getCosto(){ return this.costo; }
      
	
}

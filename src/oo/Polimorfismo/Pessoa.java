package oo.Polimorfismo;


public class Pessoa {
	
	/**
 * Peso em Kg
 */
	private double peso = 0;
	
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso() {
		return peso;	
	}
	//forma dinamica de Polimorfismo
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	//forma estatica pois para cada comida diferente teria que ser criado um metodo similar ao de baixo
	//public void comer (Feijao feijao) {
	//	this.peso += feijao.getPeso();
	//}
}  

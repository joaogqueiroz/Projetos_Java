package oo.Heranca;

public class Ferrari extends Carro {
	
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
		
	}
	//super. serve para acessar os metodos da classe pai
	public void acelerar() {
		super.acelerarMais(20);
	}
	
}

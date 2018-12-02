package classes_e_Metodos;

public class ValorVsReferencia {
	static void porValor(double numero) {
		numero ++;
	 
	}
	//Utilizar a classe produto para melhor compreensão
	static void porReferencia(Produto produto) {
		produto.preco ++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		final Produto produto = new Produto("Caneta",1); //novo produto para variavel produto
		Produto produto2 = produto; //copia da referencia de produto 2
		produto2.nome = "Lapis";// alterou o obejto
		//produto = new Produto(); // alocando espaço para um novo objeto
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
		
		
		    
	}
   }

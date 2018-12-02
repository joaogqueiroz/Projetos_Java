package classes_e_Metodos;

public class Calculadora {
	//testar juto com Calculadora_Teste
	double resultado;
		//parametros de entrada e saida
		double somar (double a, double b) {
		resultado = a + b;
		return resultado;
		
	}
	//parametros de entrada mas sem saida
	void acrescentar(double a) {
		resultado += a ;
		
	}
	//apenas parametros de saida
	double obterResultado(){
		return resultado;
			
		
	}
	//nem entrada nem saida de dados
	void limpar() {
		resultado = 0;
	}
}

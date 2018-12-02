package classes_e_Metodos;

public class Data_Teste {
	
	public static void main(String[] args) {
		Data nascimento = new Data();
		//nascimento.dia = 19;
		//nascimento.mes = 11;
		//nascimento.ano = 1987;
		
		//faz o mesmo que os códigos abaixo porem usando metodos.
		//System.out.println(nascimento.dia + "/" +nascimento.mes + "/" + nascimento.ano);
		//System.out.printf("%d/%d/%d \n", nascimento.dia, nascimento.mes, nascimento.ano);
		
		Data casamento = new Data (8, 10, 2015);
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
	}
	
}

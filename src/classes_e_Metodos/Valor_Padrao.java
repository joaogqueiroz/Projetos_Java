package classes_e_Metodos;

public class Valor_Padrao {
	static int a;// apenas funciona para variaveis de instancia ou classe
	
	public static void main(String[] args) {
		System.out.println(a);
		
		int b = 0;// variaveis locais tem que ser declaradas de formas explicitas
		System.out.println(b);
	}

}

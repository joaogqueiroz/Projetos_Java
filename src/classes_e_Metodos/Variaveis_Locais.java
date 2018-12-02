package classes_e_Metodos;

public class Variaveis_Locais {
	
	int a = 2;
	int a1 = 2;
	void teste1() {
		
		System.out.println(a);
		System.out.println(a1);
		//if(a1>3) {
			//int a2 = a1;//sasa
		//}
		
		//System.out.println(a2);// não funciona pois a2 só existe dentro da condicional
	}
	
	void teste2() {
		int a1 = 7;
		System.out.println(a1);
		System.out.println(this.a1);
	}
}

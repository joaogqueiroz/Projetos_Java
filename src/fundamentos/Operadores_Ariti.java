package fundamentos;

public class Operadores_Ariti {
	
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		//Operadores: + - * / %
		int soma = num1 + num2  + num3 + 6;
		System.out.println(soma);
		System.out.println(num1 - num2 - num3);
		
		//cuidado com a precedencia
		System.out.println(num1+ num3 * num2/2);
		System.out.println((num1 + num3) * num2/2);
		
		// resto da divis�o %
		System.out.println(10%3);
		
	}
}

package fundamentos;

public class Operadores_Unario {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		//incremento decremento
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		System.out.println(++num1 == num2--);
		System.out.println(++num1 == --num2);
		System.out.println(num1);
		System.out.println(num2);
		
		//complemento binario
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		//negacao
		System.out.println(!true);
		
	}
}

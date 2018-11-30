package fundamentos;

public class Tipos_Primitivos {
	public static void main(String[] args) {
		//Tipo primitivo Booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b \n", bo1, bo2);
		
		//Tipo primitivo caractere
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c \n ", c1, c2 ,c3 );
		
		//Tipo primitivos inteiros
		byte b = 127;
		short s = 32767;
		int i = 2_147_438_647;
		long l = 9_223_372_036_854_755_807L;
		System.out.printf("%d \n %d \n %d \n %d \n ", b, s, i, l );
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		//Tipo Primitivos reais (ponto flutuante)
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("%.2f %.1f", f, d);
	}
}

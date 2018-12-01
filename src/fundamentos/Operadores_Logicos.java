package fundamentos;

public class Operadores_Logicos {
	
	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		// ||OU   &&E  ^OU EXCLUSIVO
		boolean comprouSorverte = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorverte);
		System.out.println("Tv 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		//Operador unario intruso
		//Negação lógica
		System.out.println("Fome = " + comprouSorverte);
		
	}

}

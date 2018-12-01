package estruturas_de_Controle;

public class If_Else_If {
	public static void main(String[] args) {
		double nota = 9.5;
		
		if(nota >=9) {
			System.out.println("Quadro de Honra");
		}else if (nota >= 7) {
			System.out.println("Aprovado");
		}else if (nota >= 5.5) {
			System.out.println("Recuperação");
		}else if (nota >=3.5) {
			System.out.println("Recuperação + Trabalho!");
		}else {
			 	System.out.println("Reprovado");
		}
	}
}
   
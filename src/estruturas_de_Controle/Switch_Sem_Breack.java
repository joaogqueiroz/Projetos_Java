package estruturas_de_Controle;

public class Switch_Sem_Breack {
	public static void main(String[] args) {
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 10");	
		case "marrom":
			System.out.println("Sei fazer o 9");
		case "roxa":
			System.out.println("Sei fazer o 8");
		case "verde":
			System.out.println("Sei fazer o 7");
		case "laranaja":
			System.out.println("Sei fazer o 6");
		case "amarela":
			System.out.println("Sei fazer o 5");
		case "branca":
			System.out.println("Sei fazer o 4");
		default:	
			System.out.println("Não sei nada");
		}
	}
}

package estruturas_de_Controle;

import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;		
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas ++;
			}
			} while (nota != -1);
			
		 
	  scanner.close();
	  System.out.printf("A media � %.2f", somaDasNotas / numeroDeNotas);
		
		
		
		
		}
   }
	


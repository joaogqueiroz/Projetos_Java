package fundamentos;

import javax.swing.JOptionPane;

public class Conver_String_Num {
	
	public static void main(String[] args) {
	String resp1 = JOptionPane.showInputDialog("Qual é a nota 1 ?");
	String resp2 = JOptionPane.showInputDialog("Qual é a nota  2 ?");	
	

	
	//conversão de string em double
	
	double nota1 = Double.parseDouble(resp1);	
	double nota2 = Double.parseDouble(resp2);
	double total = nota1 + nota2;
	
	System.out.printf("Media é %.2f:",total/2);
	}
	
	
}

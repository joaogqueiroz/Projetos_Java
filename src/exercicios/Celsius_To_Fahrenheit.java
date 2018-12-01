package exercicios;

import javax.swing.JOptionPane;

public class Celsius_To_Fahrenheit {
	
	public static void main(String[] args) {
		String cel = JOptionPane.showInputDialog("Temperatura em Celsius ");
		
		double celsius = Double.parseDouble(cel);
		double fahren = celsius * 1.8 + 32;
		System.out.println(fahren);
	}
}

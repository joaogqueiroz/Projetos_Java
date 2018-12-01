package exercicios;

import javax.swing.JOptionPane;

public class Fahrenheit_To_Celsius {
	
	public static void main(String[] args) {
		String far = JOptionPane.showInputDialog("Temperatura em Fahrenheit ");
		
		double fahren = Double.parseDouble(far);
		double celsius = ((fahren - 32) / 2);
		System.out.println(celsius);
	}
}

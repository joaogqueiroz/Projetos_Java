package arrays_Colections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto_Arrumado {
	//Codigo Homog�neo
	public static void main(String[] args) {
		Set <String> aprovados = new TreeSet<String>();
		aprovados.add("Jo�o");      //Treeset respeita ordem alfabetica
		aprovados.add("Pedro");     //LinkedHashset respeita a ordem de inser��o
		aprovados.add("Maria");     //Hashset n�o respeita ordem de ordena��o e inser��o
		aprovados.add("Rafael");    
		
		for (Object nome : aprovados) {
			System.out.println(nome);
			
		}
		
	}
}

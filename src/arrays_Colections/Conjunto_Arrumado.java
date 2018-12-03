package arrays_Colections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto_Arrumado {
	//Codigo Homogêneo
	public static void main(String[] args) {
		Set <String> aprovados = new TreeSet<String>();
		aprovados.add("João");      //Treeset respeita ordem alfabetica
		aprovados.add("Pedro");     //LinkedHashset respeita a ordem de inserção
		aprovados.add("Maria");     //Hashset não respeita ordem de ordenação e inserção
		aprovados.add("Rafael");    
		
		for (Object nome : aprovados) {
			System.out.println(nome);
			
		}
		
	}
}

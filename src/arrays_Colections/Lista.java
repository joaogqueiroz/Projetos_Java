package arrays_Colections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("Get...");
		System.out.println(aprovados.get(1));
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size..." + aprovados.size());
		
		System.out.println("Remove...");
		System.out.println(aprovados.remove("Maria"));
		System.out.println("Remove..." + aprovados.size());
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
			
	} 
}

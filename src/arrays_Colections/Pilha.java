package arrays_Colections;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		//Deque<String> pilha = new ArrayDeque<>();
		//Deque serve como lista e pilha ao mesmo tempo
		Stack<String> pilha = new Stack<String>();
		//.push adiciona elementos na lista
		pilha.push("Pequeno Principe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		//pop retira da pilha já peek mantém na ordem
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop());
		
	}
}

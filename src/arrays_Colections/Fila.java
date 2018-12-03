package arrays_Colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.offer("Maria");
		fila.offer("João");
		fila.offer("Pedro");
		
		//peek retorna null com fila vazia
		//element retorna erro com fila vazia
		System.out.println("Peek/element ...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("poll;/ remove...");
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.remove());
	}
}

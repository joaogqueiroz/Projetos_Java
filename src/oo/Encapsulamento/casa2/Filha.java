package oo.Encapsulamento.casa2;

import oo.Encapsulamento.casa1.Sogra;
import oo.Encapsulamento.casa1.Sogro;

public class Filha extends Sogra {
	
	String segredoDoCasal = ("Meu marido est� quase sendo demitido");
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem..." + euMesma.segredoDoCasal);
		
		//Genro meuAmor = new Genro(); n�o consegue pois � privado
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		Sogra mae = new Sogra();
		System.out.println(euMesma.segredoDeFamilida);
		
	}
}

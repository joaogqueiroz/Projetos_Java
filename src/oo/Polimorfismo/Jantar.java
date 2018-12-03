package oo.Polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Pessoa pessoa = new Pessoa(80.7);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		System.out.println(pessoa.getPeso());
	}
}

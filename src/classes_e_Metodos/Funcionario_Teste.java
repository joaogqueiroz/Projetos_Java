package classes_e_Metodos;

public class Funcionario_Teste {
	public static void main(String[] args) {
		Funcionario Rh = new Funcionario();
		
		Rh.nome = "José";
		Rh.sal = 1.500;
		Rh.funcao = "Marceneiro";
		Funcionario Rh2= new Funcionario("Augusto", 3.000, "Chefe dos Marceneiros " );
		System.out.println(Rh2.Apresentacao());
		System.out.println(Rh.Apresentacao());
		
		
	}
}

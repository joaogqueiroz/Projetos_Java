package classes_e_Metodos;

public class Funcionario {
	String nome;
	double sal;
	String funcao;
	
	Funcionario(){
		
	}
	
	Funcionario(String nom, double salario, String func){
		nome = nom;
		sal = salario;
		funcao = func;
		
		
 		
	}
	
	String Apresentacao() {
		return String.format("O senhor " +nome + ", que recebe o salario de R$: %.5f,atuando na função de \n" +funcao ,sal);
	}
}

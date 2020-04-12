package Exercicios_facul.Q5;

public class aluno {
	private int matricula;
	private String nome;
	private double av1;	
	private double av2;
	
	public aluno( int m, String n) {
		matricula = m;
		nome = n;
		av1 = 0;
		av2 = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAv1() {
		return av1;
	}

	public void setAv1(double av1) {
		this.av1 = av1;
	}

	public double getAv2() {
		return av2;
	}

	public void setAv2(double av2) {
		this.av2 = av2;
	}
	
	public void print() {
		System.out.println("Matricula: "+ getMatricula());
		System.out.println("Nome: "+ getNome());
		System.out.println("Av1: "+ getAv1());
		System.out.println("Av2: "+ getAv2());
	}
}

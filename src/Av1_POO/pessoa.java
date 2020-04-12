package Av1_POO;

public class pessoa {
    //Atributos de instancia
    private String nome;
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int idade;
    private int id;
    
 
    
	public pessoa(String nome, int idade, int index) {
	        this.nome = nome;
	        this.idade = idade;
	        this.id = index;
	}
	public String toString() {
		return nome +"------" + idade;
	}
	
}
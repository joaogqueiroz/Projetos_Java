package Av1_POO;

public class cachePessoa {
	//Atributos de instancia
    private String nome;
    private int idade;
    private int id;
    
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
	this.idade = idade;
}

	public void setId(int index) {
		this.id = index;
	}
	public void cacheCad(String nome, int idade, int index) {
        this.nome = nome;
        this.idade = idade;
        this.id = index;
}
	

   public int retornaPessoa(int index) {
	  if(id == index) {
		  	System.out.println(nome + "------"+ idade);
			return 1;
		
	  }else{
		  return 0;
	  } 
   }
	
	 public String toString() {
	 return nome +"------" + idade;
	}
}

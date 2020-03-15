package Exercicios_facul;

import java.util.Scanner;

public class PessoaQ1 {

	static Pessoa[] lista = new Pessoa[40];
			 
	static Scanner tecla = new Scanner(System.in);
	

    static int index = 0;

public static void main(String[] args) {
    int op;
    do {                
        	System.out.println("*** MENU PRINCIPAL ***");
        	System.out.println("1-Inserir Pessoa");
        	System.out.println("2-Listar pessoas");
        	System.out.println("3-Sair");
        	op = tecla.nextInt(); 
        	switch(op){
            	case 1: incluirPessoa(); break;
            	case 2: listarPessoa(); break;
            	case 3: break;
        	}
    	} while (op!=3);       
	}

	public static void incluirPessoa() {
		 System.out.println("Digite o nome da pessoa:");
	        String nome = tecla.next();
	        System.out.println("Digite a idade da pessoa:");
	        int idade = tecla.nextInt();
	        //Criar o objeto e inserir na lista
	        lista[index++] = new Pessoa( nome, idade);
	        System.out.println("Pessoa Inserida com Sucesso");
	}
	
	public static void listarPessoa() {
        System.out.println("Pessoa:........ Idade:");
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i] != null){
                System.out.println(lista[i].getNome()
                                   + "........" +
                                   lista[i].getIdade());
            }else{
                break;
            }
        }
	}
	
	

}
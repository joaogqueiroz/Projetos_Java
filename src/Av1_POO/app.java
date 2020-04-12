package Av1_POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class app  {
   
    static int index = 0;
    //Estrutura de dados ArrayList Genérica
    static List<pessoa> lista = new ArrayList<pessoa>();
   
    static Scanner tecla = new Scanner(System.in);

    public static  void main(String[] args) {
        int op;
        do {                
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1-Incluir pessoa");
            System.out.println("2-Listar pessoa por idade");
            System.out.println("3-Listar pessoas");
            System.out.println("4-Buscar pessoa");
            System.out.println("5-Sair");
            System.out.println("Digite sua opção: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluirpessoa(); break;
                case 2: listaPorIdade(); break;
                case 3: listarpessoas(); break;
                case 4: consultarpessoas(); break;
                case 5: break;
            }
        } while (op!=5);       
    }
    
    public static void incluirpessoa(){
        //Entrada
        System.out.println("Digite o nome da pessoa:");
        String nome = tecla.next();
        System.out.println("Digite a idade da pessoa:");
        int idade = tecla.nextInt();
        lista.add(new pessoa(nome, idade,index));
        index ++;
        System.out.println("pessoa cadastrada com sucesso!");
    }
    
    public static void listaPorIdade(){
    Collections.sort(lista,new Comparator<pessoa>() {
		@Override//faz ordenação da lista pela idade
		public int compare(pessoa o1, pessoa o2) {
		return Integer.compare(o1.getIdade(), o2.getIdade());
				}
    	});
    System.out.println(lista);									
    	//volta a lista a ordem original pelo ID
    	 Collections.sort(lista,new Comparator<pessoa>() {
    		@Override
    		public int compare(pessoa o1, pessoa o2) {
    		return Integer.compare(o1.getId(), o2.getId());
    				}	
    	    });
    	
    }	
    	public static void listarpessoas(){
        System.out.println("---------------------------------------");
        System.out.println("| Nº Nome:........Idade:........Id:   |");
        for (pessoa p : lista) {
            System.out.println("| " + p.getNome()+ "........" + p.getIdade() + "........" + p.getId() + " |");
            
        }
    }
    	static cachePessoa cache = new cachePessoa();
    	public static void consultarpessoas(){
            System.out.println("Digite o id da pessoa:");
            int id = tecla.nextInt();
            System.out.println("Nome-------Idade");
            //cache.setId(1);
            int flag = cache.retornaPessoa(id);
            	if(flag == 0) {
            		System.out.println(lista.get(id));
            		String nomec =lista.get(id).getNome();
            		int idadec = lista.get(id).getIdade();
            		cache.cacheCad(nomec, idadec, id);
            		}	
            
    	
    	}
}    

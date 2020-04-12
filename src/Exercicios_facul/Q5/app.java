package Exercicios_facul.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Av1_POO.pessoa;

public class app {
	static List<aluno> lista = new ArrayList<aluno>();
	
	static Scanner tecla = new Scanner(System.in);

	
	public static  void main(String[] args) {
        int op;
        do {                
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1-Incluir aluno");
            System.out.println("2-Excluir aluno");
            System.out.println("3-lancar/editar notas");
            System.out.println("4-Consultar alunos");
            System.out.println("5-Consultar situação aluno");
            System.out.println("6-Sair");
            
            System.out.println("Digite sua opção: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluirAluno(); break;
                case 2: excluirAluno(); break;
                case 3: alterarAluno(); break;
                case 4: listarAlinos(); break;
                case 5: consultarAluno(); break;
                case 6: break;
                
            }
        } while (op!=6);       
	}
        
        public static void incluirAluno(){
        	
            //Entrada
            System.out.println("Digite o nome do aluno:");
            String nome = tecla.next();
            System.out.println("Digite a matricula:");
            int matri = tecla.nextInt();
            lista.add(new aluno(matri, nome));
            System.out.println("Aluno cadastrado com sucesso!");
        }
        
        public static void excluirAluno() {
        	System.out.println("Digite a matricula:");
            int matri = tecla.nextInt();
            for(aluno a: lista) {
            	if(a.getMatricula() == matri) {
            		lista.remove(a);
            		break;
            	}
            }
        	
        }
        public static void alterarAluno() { 	
        	System.out.println("Digite a matricula:");
            int matri = tecla.nextInt();
            for(aluno a: lista) {
            	if(a.getMatricula()==matri) {
            	System.out.println("Digite AV1:");
            	a.setAv1(tecla.nextDouble());
            	System.out.println("Digite AV1:");
            	a.setAv2(tecla.nextDouble());
            	break;
            	}
            }
        
        }
        public static void listarAlinos() {
        if(lista.isEmpty()==false) {
        	System.out.println("Lista de Alunos cadastrados:");
        	for(aluno a:lista) {
        		a.print();
        		}
        	}else {
        		System.out.println("Lista vazia.");	
        		}
        	} 
        public static void consultarAluno() { 	
        	System.out.println("Digite a matricula:");
            int matri = tecla.nextInt();
            for(aluno a: lista) {
            	if(a.getMatricula()==matri) {
            	double media = (a.getAv1()+a.getAv2())/2;
            	if(media >= 6.0) {
            		System.out.println("AV1: "+ a.getAv1());
            		System.out.println("AV2: "+ a.getAv2());
            		System.out.println("Media: "+ media);
            		System.out.println("APROVADO");
            		
            		}else if (media <6.0) {
                		System.out.println("AV1: "+ a.getAv1());
                		System.out.println("AV2: "+ a.getAv2());
                		System.out.println("Media: "+ media);
                		System.out.println("Reprovado!");
                			
            		}
            	}
            	}
        
    }













}

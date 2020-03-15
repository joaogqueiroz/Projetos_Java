package Exercicios_facul.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {

    
    //Constante
    static final int MAXCONTA = 20;
   
    //variável comum
    static int index = 0;
    
    //Lista de contas
    static Conta[] lista = new Conta[MAXCONTA];
    
    static Scanner tecla = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {                
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1-Incluir conta");
            System.out.println("2-Sacar");
            System.out.println("3-Depositar");
            System.out.println("4-Listar saldo das Contas");
            System.out.println("5-Sair");
            System.out.println("6-Remover");
            System.out.println("7-Consultar saldo");
            System.out.println("Digite sua operacao: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluirConta(); break;
                case 2: sacarValor(); break;
                case 3: depositarValor(); break;    
                case 4: listarContas(); break;
                case 5: break;
                case 6: remover(); break;
                case 7:consultaSaldo(); break;
            }
        } while (op!=5);       
    }
    
    
    public static void incluirConta(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldo = tecla.nextDouble();
        //Criar o objeto e inserir na lista
        lista[index++] = new Conta(num, saldo);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    public static void sacarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do saque:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].sacar(valor);
                break;
            }
        }
    }
    
    public static void depositarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do depósito:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].depositar(valor);
                break;
            }
        }
    }
    
    public static void listarContas(){
        double total = 0;
        System.out.println("N� Conta:........ SALDO:");
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i] != null){
                System.out.println(lista[i].getNumero()
                                   + "........" +
                                   lista[i].getSaldo());
                //total += lista[i].getSaldo();
                total = total + lista[i].getSaldo();
            }else{
                break;
            }
        }
        System.out.println("Total:........" + total);
    }
   
   
    
    public static void consultaSaldo(){
    	System.out.println("Digite o numero da conta:");
    	int num = tecla.nextInt();
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
            	System.out.println("Saldo para da conta: "+lista[i].getSaldo());
                break;
            }
        }
    }
    
    public static void remover(){
    	System.out.println("Digite o numero da conta:");
    	int num = tecla.nextInt();
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
            	lista[i].remover(num, lista[i].getSaldo());;
                break;
            }
        }
    } 
}

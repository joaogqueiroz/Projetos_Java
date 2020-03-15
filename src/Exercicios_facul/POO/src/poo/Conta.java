
package poo;

public class Conta {

    private final static double TAXA = 8.9;
    
    //Atributos de instância
    private int numero;
    private double saldo;
    private boolean status;
    
    //Métodos de acesso
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Construtor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = true;
    }

    public void sacar(double valor){
        saldo -= valor;
        //saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        saldo += valor;
        //saldo = saldo + valor;
    }
}

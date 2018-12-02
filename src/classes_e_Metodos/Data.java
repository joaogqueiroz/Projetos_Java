package classes_e_Metodos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1, 1, 2017); //this() representa um construtor
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia; //this representa o objeto atual que esta sendo executado naquele momento
		this.mes = mes;
		this.ano = ano;
	}
	String formatar() {
		return String.format("%d/%d/%d\n", this.dia, mes, ano);
	}
}

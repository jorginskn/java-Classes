package classe;

public class Data {
	int dia ;
	int mes;
	int ano ;
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes , ano);
		
	}
	
	Data(int diaInicial, int mesInicial , int anoInicial){
		
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	Data(){
		dia = 7;
		mes = 6;
		ano = 1999;
	}
}

package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		var data2 = new Data(1, 1 , 1970);
		 
		
//		data.dia = 07;
//		data.mes =06;
		data.ano = 2000;
		String dataFormatada = data.obterDataFormatada();
		 

		
		
		
		 System.out.printf(dataFormatada);
		 System.out.printf(data2.obterDataFormatada());
		 
		 // var data2 = new Data();
		 
		 
		 
		 
	}
		 
	}

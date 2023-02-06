package classe;
import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		  
		 Produto p1 = new Produto();
		 p1.nome = "Jorge";
		 p1.preco = 2900;
		 p1.desconto = 0.25;
		 
		 
		 var p2 = new Produto();
		 p2.nome= " O pica";
		 p2.preco= 100;
		 p2.desconto = 0.10;
		 
		 p2.preco = p2.preco /  p2.desconto;
		 System.out.print(p2.preco);
	}
}

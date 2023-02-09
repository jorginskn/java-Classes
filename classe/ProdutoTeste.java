package classe;
 
public class ProdutoTeste {
	public static void main(String[] args) {
		
		  
		 Produto p1 = new Produto("Jorge ", 4356.89);
// 		 p1.nome = "Jorge";
//		 p1.preco = 4356.89;
//		 p1.desconto = 0.25;
		 
		 
		 var p2 = new Produto();
		 p2.nome= "Caneta preta4";
		 p2.preco= 12.56;
		 Produto.desconto = 0.50;
		 
 		 System.out.println(p1.nome + " " + p1.precoComDesconto(0.1));
 		 System.out.println(p1.nome + " " + p1.precoComDesconto(0));

 		 
 		 
 		 double precoFinal1 =   p1.precoComDesconto(0);
 		 double precoFinal2 =  p2.precoComDesconto(0.1);		 
 		 double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
 		 
 		 System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
 	}
}

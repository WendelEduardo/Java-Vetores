import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");

		String[] nomeProduto = new String[3];
		int[] codigoProduto = new int[3];
		double[] precoProduto = new double[3];
		
		String nomeDoProduto = "";
		int aumento = 0;
		
		System.out.println("------------------ Cadastro dos Produtos ------------------");
		for(int contador = 0; contador < nomeProduto.length; contador++) {
			System.out.print("Nome do produto: ");
			nomeProduto[contador] = entrada.next();
			
			System.out.print("Código do produto: ");
			codigoProduto[contador] = entrada.nextInt();
			
			System.out.print("Preço do produto: ");
			precoProduto[contador] = entrada.nextDouble();
			
			System.out.println("    ");
		}
				
		System.out.println("------------------------ Resultado ------------------------");
		for(int contador = 0; contador < nomeProduto.length; contador++) {
				
			if(codigoProduto[contador]%2 == 0 || precoProduto[contador] > 1000) {
				if(codigoProduto[contador]%2 == 0 && precoProduto[contador] > 1000) {
					//AUMENTO DE 18%
					precoProduto[contador] = precoProduto[contador]*1.18;
					nomeDoProduto = nomeProduto[contador];
					aumento = 18;
				}
				if(codigoProduto[contador]%2 == 0 && precoProduto[contador] < 1000) {
					//AUMENTO DE 12%
					precoProduto[contador] = precoProduto[contador]*1.12;
					nomeDoProduto = nomeProduto[contador];
					aumento = 12;
				}
				if(codigoProduto[contador]%2 != 0 && precoProduto[contador] > 1000) {
					//AUMENTO DE 15%
					precoProduto[contador] = precoProduto[contador]*1.15;
					nomeDoProduto = nomeProduto[contador];
					aumento = 15;
				}
			}
			
			System.out.println("O produto "+ nomeDoProduto+ " sofrera um aumento de "+aumento+"%, tornando um preço: "+ formataMoeda.format(precoProduto[contador]));
		}
	}

}

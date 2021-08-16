import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");
		
		String[] nome = new String [3];
		double[] vendas = new double[3];
		float[] percentual = new float[3];
		String[] estado = new String[3];
	
		double valorMenor = 0;
		int indVendedor =0;
		int maiorVendedor=0;
		
		double[] valorComissao = new double[3];
		
		int totalVendasTodos = 0;
		double totalComissaoTodos = 0;
		int paulistas = 0;
		
		double numMaior = 0;
	
		for(int contador = 0; contador < 3; contador++) {
			System.out.print("Digite o nome do vendedor: ");
			nome[contador] = entrada.next();
			
			System.out.print("Digite o total das vendas: ");
			vendas[contador] = entrada.nextDouble();
			
			System.out.print("Digite o percentual das comissões: ");
			percentual[contador] = entrada.nextFloat()/100;
			
			System.out.print("Digite o estado do vendedor: ");
			estado[contador] = entrada.next();
			
			valorComissao[contador] = vendas[contador]*percentual[contador];
			
		}
		
		System.out.println(" ");
		System.out.println("Nome" + "\t" + "Vendas" + "\t" + "Percentual" + "\t" + "Comissão" + "\t" + "Estado");
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.println(nome[contador] + "\t" + formataMoeda.format(vendas[contador]) + "\t" + (percentual[contador]*100)+"%"+ "\t" + formataMoeda.format(valorComissao[contador]) + "\t" + estado[contador]);
		
			totalVendasTodos += vendas[contador];
			totalComissaoTodos += valorComissao[contador];
			
			if(estado[contador].equalsIgnoreCase("sp")) {
				paulistas++;
			}
			
			if(vendas[contador] > numMaior) {
				numMaior = vendas[contador];
				maiorVendedor = contador;
			}
			
			if(contador == 0) {
				valorMenor = vendas[contador];
				indVendedor = contador;
			
			}else {
				if(valorMenor > vendas[contador]) {
					valorMenor = vendas[contador];
					indVendedor = contador;
				}
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Total de vendas realizadas: " + formataMoeda.format(totalVendasTodos));
		System.out.println("Total de comissões pagas: " + formataMoeda.format(totalComissaoTodos));
		System.out.println(paulistas+ " vendedor(es) de SP");
		System.out.println("O maior valor vendido é: "+ formataMoeda.format(numMaior)+", vendedor: "+nome[maiorVendedor]);
		System.out.println("O menor valor vendido é: "+ valorMenor + ", vendedor: "+nome[indVendedor]);
	}

}

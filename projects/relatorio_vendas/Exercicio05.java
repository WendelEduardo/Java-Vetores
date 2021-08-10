import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");

		double[] preco = new double[10];
		int[] quantidade = new int[10];
		double[] total = new double[10];
		
		int quantidadeMaior = 0, numMaior, numMenor;
		
		double menor = 0, maior = 0, totalGeral = 0, maiorPreco = 0;
		
		for(int i=0; i <10; i++){
			System.out.println(" ");
			System.out.println("------------------ Produto "+(i+1)+"  ------------------");
			System.out.println(" ");
			
			System.out.print("Informe o pre�o unit�rio de cada objeto: ");
			preco[i] = entrada.nextDouble();
			
			System.out.print("Informe a quantidade vendida: ");
			quantidade[i] = entrada.nextInt();
			
			total[i] = preco[i]*quantidade[i];
		
			// Pre�o maior quantidade vendida
			if(quantidade[i] > quantidadeMaior) {
				quantidadeMaior = quantidade[i];
				maiorPreco = preco[i];
			}
			
			totalGeral += total[i];
		}
		
		System.out.println(" ");
		System.out.println("------------------ Relat�rio de Vendas  ------------------");
		for(int i=0; i <10; i++) {
			
			System.out.println("Quantidade: "+quantidade[i]+" \t Pre�o: "+ formataMoeda.format(preco[i])+" \t Total: "+ formataMoeda.format(total[i]));
			
		}
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Total Geral: "+ formataMoeda.format(totalGeral));
		System.out.println(" ");
		
		System.out.println("------------------ Comiss�o  ------------------");
		System.out.println("Comiss�o: "+ formataMoeda.format(totalGeral*0.05));
		System.out.println(" ");
		
		System.out.println("------------------ Pre�o da maior quantidade vendida  ------------------");
		System.out.println("Pre�o da maior quantidade vendida: "+formataMoeda.format(maiorPreco));
		
	}

}

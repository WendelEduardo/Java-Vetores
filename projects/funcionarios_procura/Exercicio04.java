import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");
		
		String[] nome = new String[5];
		double[] salario = new double[5];
		int[] tempoServico = new int[5];
		double NovoSalario = 0;
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("------------ "+(i+1)+ "� FUNCION�RIO ------------");
			System.out.println("                            ");
			System.out.print("Digite o nome do funcion�rio: ");
			nome[i] = entrada.next();
			
			System.out.print("Digite o sal�rio do funcion�rio "+ nome[i]+": ");
			salario[i] = entrada.nextDouble();
			
			System.out.print("Digite o tempo de servi�o do funcion�rio "+ nome[i] +": ");
			tempoServico[i] = entrada.nextInt();
			
			System.out.println("                                 ");
		}
		
		//N�O TER�O AUMENTO
		System.out.println("------------ N�o tem direito ao aumento ------------");
		for(int i = 0; i <= 4; i++) {
			if(tempoServico[i] < 5 && salario[i] > 780) {
				System.out.println(nome[i]);
			}
		}
		
		
		//AUMENTO
		System.out.println("------------ Tem direito ao aumento ------------");
		for(int i = 0; i <= 4; i++) {
			
			if(tempoServico[i] >= 5 || salario[i] <= 780) {
				
				if(tempoServico[i] > 5 && salario[i] < 780) {
					//AUMENTO DE 35%
					NovoSalario = salario[i] * 1.35;
					//System.out.println("Nome: " + nome[i] + "            - Novo sal�rio: R$" + formataMoeda.format(salario[i]));
				}
				
				if(tempoServico[i] > 5 && salario[i] > 780) {
					//AUMENTO DE 25%
					NovoSalario = salario[i] * 1.25;
					//System.out.println("Nome: " + nome[i] + "            - Novo sal�rio: R$" + formataMoeda.format(salario[i]));
				}
				
				if(salario[i] < 780 && tempoServico[i] < 5 ) {
					//AUMENTO DE 15%
					NovoSalario = salario[i] * 1.15;
					//System.out.println("Nome: " + nome[i] + "            - Novo sal�rio: R$" + formataMoeda.format(salario[i]));
				}
			}
			
			System.out.println("Nome: " + nome[i] + "            - Novo sal�rio: R$" + formataMoeda.format(NovoSalario));
			
		}	
	}
}
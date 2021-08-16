import java.util.Scanner;

public class Exercicio07{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] resultante = new int[20];
		
		int j=0;
	

		// Carregar vetores
		// VETOR 01
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número no vetor 1 - posição [" + i + "]:");
			vetor1[i] = entrada.nextInt();
		}

		// VETOR 02
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número no vetor 2 - posição [" + i + "]:");
			vetor2[i] = entrada.nextInt();
		}
		
		//INTERCALAR
		for(int i=0; i<10; i++) {
			resultante[j] = vetor1[i];
			System.out.println("Vetor resultante - posição "+ (j+1)+" - Valor: "+ resultante[j]);
			j++;
			
			resultante[j] = vetor2[i];
			System.out.println("Vetor resultante - posição " +(j+1)+" - Valor: "+ resultante[j]);
			j++;
		}
		
		for(int i =0; i<20; i++) {
			System.out.println(resultante[i]);
		}
		
	}
}
		
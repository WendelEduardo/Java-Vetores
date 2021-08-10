import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		String[] gabarito = new String[] {"A", "A", "A", "A", "A", "A", "A", "A"};
		String[] questao = new String[8];
		
		int respostaCerta = 0;
		int numeroAluno;
		
		
		for(int i=0; i<10; i++) {
			System.out.println(" ");
			System.out.println("\t Aluno "+(i+1)+"\t");
			System.out.println(" "); 
			
			System.out.print("Digite o número "+(i+1)+"° aluno: ");
			numeroAluno = entrada.nextInt();
			
			for(int contador=0; contador < gabarito.length; contador++) {
				System.out.print("Digite a resposta dada pelo aluno "+numeroAluno+" à "+(contador+1)+"° questão: ");
				questao[i] = entrada.next();
				
				if(questao[i].equalsIgnoreCase(gabarito[i])) {
					respostaCerta++;
				}
			}
			
			System.out.println("A nota do aluno foi: "+ respostaCerta);
			
		}
	}

}

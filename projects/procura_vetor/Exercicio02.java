import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		String[] nome = new String[10];
		String procura, pergunta = "S";
		
		for(int contador = 0; contador<10; contador++) {
			System.out.print("Digite o "+(contador+1)+" nome: ");
			nome[contador] = entrada.next();
		}
		
		while(!(pergunta.equalsIgnoreCase("N"))) {
		
		System.out.println("                                    ");
		System.out.print("Digite o nome para procurar no vetor: ");
		procura = entrada.next();
		System.out.println("                                    ");
		
		for(int contador = 0; contador<10; contador++) {
			while(procura.equalsIgnoreCase(nome[contador])) {
				System.out.println("Achei: " + nome[contador] + " está na posição "+ contador);
				break;
			}
			
			while(!(procura.equalsIgnoreCase(nome[contador]))) {
				System.out.println("Não achei");
				break;
			}
		}		
		
		System.out.println("Deseja procurar um novo nome? (S/N)");
		pergunta = entrada.next();
		
		}
		
		System.out.println("Acabou!");
		
	}

}

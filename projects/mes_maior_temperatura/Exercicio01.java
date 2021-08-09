import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String[] nomeMeses = new String[] {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double[] temperaturaMes = new double[12]; 
		
		int numMaior = 0, numMenor = 0;
		double tempMaior=0, tempMenor=0;
		
		for(int contador=0; contador< 12; contador++) {
			System.out.print("Informe a temperatura do m�s de " + nomeMeses[contador] + ": ");
			temperaturaMes[contador] = entrada.nextDouble();
			
			//Primeiro valor digitador � carregado na vari�vel
			if(contador == 0) {
				tempMenor = temperaturaMes[contador];
				numMenor = contador;
			}
			
			//MAIOR TEMPERATURA
			if(temperaturaMes[contador] > tempMaior) {
				tempMaior = temperaturaMes[contador];
				numMaior = contador;
			}
			
			//	MENOR TEMPERATURA
			if(temperaturaMes[contador] < tempMenor){
				tempMenor = temperaturaMes[contador];
				numMenor = contador;
			}
		}
		System.out.println("                                                                          ");
		
		System.out.println("Maior temperatura: " + tempMaior + " ocorreu no m�s "+ nomeMeses[numMaior]);
		System.out.println("Menor temperatura: " + tempMenor + " ocorreu no m�s "+ nomeMeses[numMenor]);
		
		
	}

}

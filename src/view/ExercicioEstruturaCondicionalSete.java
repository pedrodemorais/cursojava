package view;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicionalSete {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		double x = 0.0;
		double y = 0.0;

		System.out.println("Digite a Cordenada X");
		x = ler.nextDouble();

		System.out.println("Digite a Cordenada y");
		y = ler.nextDouble();

		if (x > 0 && y > 0) {

			System.out.println("Q1");
			
		} else if (x > 0 && y < 0) {

			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");

		} else if (x < 0 && y < 0) {
			System.out.println("Q3");

		}else if(x==0.0) {
			System.out.println("Eixo X");
			
		}else if(y==0.0) {
			System.out.println("Eixo Y");
		}
		
		else 
			System.out.println("Origem");

		ler.close();

	}

}

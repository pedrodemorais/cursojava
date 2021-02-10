import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstuturaCondicionalOito {
	public static void main(String[] args) {
		double salario;
		double imposto;
	//	double imposto2;

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor do Salário: ");
		salario = ler.nextDouble();
		ler.close();
		if(salario < 2000.00) {
			
			System.out.println("Isento");
			
		}else if(salario > 2000.01 && salario <3000.00) {
			//8%
			
			imposto=(salario-2000)*0.08;
			System.out.println("R$: "+imposto);
			
			
			
		}else if(salario > 3000.01 && salario <4500.00) {
			//18%
			imposto=(salario-2000)*0.18+80;
			System.out.println("R$: "+imposto);
			
		}else if(salario > 4500.01) {
			imposto=(salario-4500)*0.28+270;
			System.out.printf("R$: %.2f%n",imposto);
			
			
			//28%
		}

	}

}

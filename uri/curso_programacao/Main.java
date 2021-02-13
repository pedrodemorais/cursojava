package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int numEmployee = input.nextInt();
		int workedHours = input.nextInt();
		double valueWoredHours = input.nextDouble();
		double salary=valueWoredHours*workedHours ;
		System.out.println("NUMBER = "+numEmployee);
		System.out.printf("SALARY = U$ %.2f%n",salary);
		
	
	
	}

}

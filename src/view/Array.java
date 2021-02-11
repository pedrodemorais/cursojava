package view;
import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double soma=0;
		double media=0;
		int n = input.nextInt();
		double[] vet = new double[n];

		for(int i=0; i<vet.length; i++) {
			double numero=input.nextDouble();
			vet[i]=numero;
			soma +=numero;
		}
		
		media = soma/n;
		System.out.printf("Média:%.2f%n",media);
		
		input.close();

	}

}

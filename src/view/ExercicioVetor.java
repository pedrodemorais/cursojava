package view;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		System.out.println("Tamanho do Vetor");
		int tamanhoVetor = input.nextInt();

		int[] vect = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			vect[i] = input.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}
		
		
	}

}

package curso_programacao;

import java.util.Scanner;

public class FibonnaciEPrimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long num1 = input.nextInt();
		long num2 = input.nextInt();

		if (num1 < num2) {

			for (long i = num1; i < num2; i++) {

				if (FibonnaciEPrimo.fibo(i) < num2) {

					System.out.print(FibonnaciEPrimo.fibo(i));

					if (FibonnaciEPrimo.fibo(i) % 2 == 0 ) {
						
						System.out.print(" - Par");
					} else {
						System.out.print(" - ímpar");

						
					}
					
					if (FibonnaciEPrimo.ePrimo(i)) {
						System.out.print(" e Primo");
					}
					System.out.println();
				}
			}

		} else {

			for (long i = num2; i < num1; i++) {

				if (FibonnaciEPrimo.fibo(i) < num1) {

					System.out.print(FibonnaciEPrimo.fibo(i));

					if (FibonnaciEPrimo.fibo(i) % 2 == 0 ) {
						
						System.out.print(" - Par");
					} else {
						System.out.print(" - ímpar");

						
					}
					
					if (FibonnaciEPrimo.ePrimo(i)) {
						System.out.print(" e Primo");
					}
					System.out.println();
				}
			}
		}

		input.close();

	}

	private static long fibo(long n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

	private static boolean ePrimo(long numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}


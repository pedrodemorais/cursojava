package view;
import java.util.Locale;
import java.util.Scanner;

import entitie.Producto;

public class Array2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		System.out.println("Quantos produtos deseja cadastrar?");
		int n = input.nextInt();
		double valueTotal=0;

		Producto[] vect = new Producto[n];

		for (int i = 0; i < vect.length; i++) {
			
			input.nextLine();
			System.out.println("Descrição do Produto: ");
			String nameProduct = input.nextLine();
			System.out.println("Preço do Produto: ");
			double priceProduct = input.nextDouble();
			vect[i] = new Producto(nameProduct, priceProduct);
			valueTotal += vect[i].getPriceProduct() ;
			
		}
		
		for (int x=0; x < vect.length; x++) {
			System.out.println(vect[x].toString());
			
		}
		System.out.printf("Total a Pagar: R$ %.2f%n",valueTotal);

	}

}

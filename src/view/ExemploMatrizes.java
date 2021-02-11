package view;

import java.util.Scanner;

public class ExemploMatrizes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sizeMat;

		System.out.println("Digite o tamanho da Matriz: ");

		sizeMat = input.nextInt();
		int mat[][] = new int[sizeMat][sizeMat];
		int countNumber=0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			 System.out.print(mat[i][i]+" ");
		}
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j < mat[i].length; j++) {
				if(mat[i][j] <0) {
					countNumber ++;
				}
			}
			
		}
		System.out.println("\nTem "+countNumber+" numeros negativos");

		input.close();

	}

}

package view;

import java.util.Scanner;

public class ExercicioMatrizProfessor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int lineMat;
		int column;
		int mat[][];
		int numMat;
		
		
		System.out.println("Quantas Colunas?");
		column=input.nextInt();
		
		System.out.println("Quantas Linhas?");
		lineMat=input.nextInt();
		
		mat = new int[lineMat][column];
		System.out.println();
		
		for(int i=0; i < lineMat; i++) {
			
			for(int j=0; j < column; j++) {
				mat[i][j] =input.nextInt();
				
			}
			
		}
		
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Escolha um numero da Matriz digitada:");
		numMat = input.nextInt();
		
		for(int i=0; i < mat.length; i++) {
			
			for(int j=0; j< mat[i].length;j++) {
				
				if(mat[i][j] == numMat) {
					System.out.println("Position: "+i+", "+j);
					if(j>0) {
						System.out.println("Left: "+ mat[i][j-1]);
						
					}if(i>0) {
						System.out.println("UP: "+ mat[i-1][j]);
						
					}if(j< mat[i].length-1) {
						System.out.println("Right: "+ mat[i][j+1]);
						
						
					}if(i<mat.length-1) {
						System.out.println("UP: "+ mat[i+1][j]);
						
					}
				
				
			}
			
		}
		
		
		
		input.close();
		
	}

}}

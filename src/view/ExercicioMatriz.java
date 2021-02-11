package view;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int line = 0;
		int column = 0;
		int numMatrix=0;
		int numMatrix1=0;
		int[][] mat;
		int left=0;
		int right=0;
		int up=0;
		int down=0;
		
		boolean existeNaMatriz=false;

		System.out.println("Digite Linha x coluna:");

		line = input.nextInt();
		column = input.nextInt();

		mat = new int[line][column];

		System.out.println("Digite os numeros da Matrix:");

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				
				mat[i][j] = input.nextInt();

			}

		}

		System.out.println("---------------Matriz " + line + "x" + column + " -----------------------");

		for (int j = 0; j < line; j++) {
			for (int y = 0; y < column; y++) {
				
				System.out.print(mat[j][y]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Entre com um numero da Matriz: ");
		
		numMatrix1 = input.nextInt();
		
		for(int i=0; i< line; i++) {
			for(int j=0; j< column; j++) {
								
				if (mat[i][j]==numMatrix1) {
					
					System.out.println("Posição- Coluna "+ i+", linha:  "+j);
					
					if((i-1)<0 && (j -1) < 0) {
						down = mat[i+1][j];
						right=mat[i][j+1];
						System.out.println("Direita: "+right);
						System.out.println("Abaixo: "+down);
						
						
						
					} else if(i==0 && j >0 &&  (j+1) < line ) {
						left=mat[i][j-1];
						right=mat[i][j+1];
						down = mat[i+1][j];
						
						System.out.println("Esquerda: "+left);
						System.out.println("Direita: "+right);
						System.out.println("Abaixo: "+down);
						
					}else if(i==0 &&  (j+1) == line) {
						
						left=mat[i][j-1];
						down = mat[i+1][j];
						
						System.out.println("Esquerda: "+left);
						System.out.println("Abaixo: "+down);
						
						
					}else if(i>0 && j==0 && (i+1)<line) {
						up = mat[i-1][j];
						right=mat[i][j+1];
						down = mat[i+1][j];
						
				        System.out.println("Acima: "+up);
						System.out.println("Direita: "+right);
						System.out.println("Abaixo: "+down);
						
						
					}else if(i>0 && j>0 && (j+1)<column && (i+1)<column) {
						
						up = mat[i-1][j];
						down = mat[i+1][j];
						left=mat[i][j-1];
						right=mat[i][j+1];
						
							System.out.println("Acima: "+up);
							System.out.println("Esquerda: "+left);
							System.out.println("Direita: "+right);
							System.out.println("Abaixo: "+down);
						
						
					}else if(i > 0 && j < column && (i+1) < column) {
						
						up = mat[i-1][j];
						down = mat[i+1][j];
						left=mat[i][j-1];
						
						System.out.println("Acima: "+up);
						System.out.println("Esquerda: "+left);
						System.out.println("Abaixo: "+down);
						
					} else if(i>0 && j==0) {
						up = mat[i-1][j];
						right=mat[i][j+1];
						
						System.out.println("Acima: "+up);
						System.out.println("Direita: "+right);
						
						
					} else if(i>0 && j>0 && j+1 <column ) {
						
						up = mat[i-1][j];
						left=mat[i][j-1];
						right=mat[i][j+1];
						
							System.out.println("Acima: "+up);
							System.out.println("Esquerda: "+left);
							System.out.println("Direita: "+right);
						
						
					}else if(i<line && j < column) {
						up = mat[i-1][j];
						left=mat[i][j-1];
						
						System.out.println("Acima: "+up);
						System.out.println("Esquerda: "+left);
						
					}
					
					
					
					existeNaMatriz = true;
					
					
				}else existeNaMatriz=false;
			}
			
		}
	
		
		

	}
}

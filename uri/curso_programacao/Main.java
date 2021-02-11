package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	int num1=0, num2=0, num3=0, num4=0;
	
	num1 = input.nextInt();
	num2 = input.nextInt();
	num3 = input.nextInt();
	num4 = input.nextInt();
	
	int  produto = (num1 * num2) - ( num3 * num4) ;
	System.out.println("DIFERENCA = "+produto);

	}

}

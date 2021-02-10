import java.util.Scanner;

public class ExercicioEstruturaRepetitivaDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		Scanner ler = new Scanner(System.in);
		
		

		System.out.println("Insira a Cordenada x");
		x=ler.nextInt();

		System.out.println("Insira a Cordenada Y");
		y=ler.nextInt();
		
		
		while(x!=0 && y!=0) {
		
			System.out.println("Insira a Cordenada x");
			x=ler.nextInt();

			System.out.println("Insira a Cordenada Y");
			y=ler.nextInt();

			
		} 
		
		
	}

}

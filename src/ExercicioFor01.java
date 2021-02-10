import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		
		int num = 0;
		int var = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Numero:");
		num = ler.nextInt();
		var =num;
 
		if (1<=num && num <=1000) {	
			System.out.println(var);
			for (int x = num; x > 0; x--) {
				
				if(x %2!=0) {
					System.out.println(x);
					
				}}
			

		}else { 
			System.out.println("Numero Invalido");

		ler.close();

	}}}



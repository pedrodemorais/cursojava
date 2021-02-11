package view;
import java.util.Scanner;

public class ExercicioEstruturaRepetitivaUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int senha=0;
		Scanner ler = new Scanner(System.in);
		while(senha !=2002) {
			
			System.out.println("Senha:");
			senha = ler.nextInt();
			if(senha!=2002) {
			System.out.println("Senha Inválida!");
			
		}

	}
		System.out.println("Acesso Permitido!");

}}

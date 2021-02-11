package view;
import java.util.Locale;
import java.util.Scanner;

import entitie.Aluguel;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Aluguel vect [] = new Aluguel[10];
		
		String nomeHospede;
		String emailHospede;
		int numeroQuarto;
		
		System.out.println("Quantos estudantes irão hospedar?");
		int numEstudantes=input.nextInt();
		
		for(int i=0; i< numEstudantes; i++ ){
			
			input.nextLine();
			System.out.println("Nome: ");
			nomeHospede = input.nextLine();
			System.out.println("e-mail: ");
			emailHospede = input.nextLine();
			System.out.println("Quarto: ");
			numeroQuarto = input.nextInt();
			
			vect[numeroQuarto]= new Aluguel(nomeHospede, emailHospede, numeroQuarto);
			
			
		}
		
		
		for(int i=0; i<vect.length; i++) {
			
			if(vect[i]!= null) {
				System.out.println(vect[i]);
				
				
				
			}
			
		}
		

	}

}

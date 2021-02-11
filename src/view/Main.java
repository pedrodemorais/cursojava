package view;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int num=0;
		int soma=0;
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		while(num!=0) {
			soma += num;
			num = ler.nextInt();
			
			
		}
		
		
		System.out.println(soma);
		ler.close();
	}
}
package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String senha;
		senha = input.nextLine();

			validaSenha(senha);
			input.close();

	}

	public static boolean validaSenha(String senha) {
		String x = senha;
		
		x.matches("^(?:(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.['!@#$%^¨&(){}~,.<>;?+=]).)[^\\s]{8,}$");
		System.out.println(x.matches("^(?:(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.['!@#$%^¨&(){}~,.<>;?+=]).)[^\\s]{8,}$"));
		if (x.length() < 8) {
			//System.out.println("Senha não é segura");
			return false;

		}else {
			for(int i=0; i< x.length();i++) {
				if(x.charAt(i) =='!' || x.charAt(i)=='@'|| x.charAt(i)=='#'|| x.charAt(i)=='$'|| 
				   x.charAt(i)=='%'|| x.charAt(i)=='¨'|| x.charAt(i)=='&'|| x.charAt(i)=='*'|| x.charAt(i)=='(' || x.charAt(i)==')'|| 
				   x.charAt(i)=='_'|| x.charAt(i)=='-'|| x.charAt(i)=='='|| x.charAt(i)=='+'|| x.charAt(i)=='"'|| x.charAt(i)==';'|| 
				   x.charAt(i)=='}'|| x.charAt(i)=='{'|| x.charAt(i)=='['|| x.charAt(i)==']'|| x.charAt(i)=='´'|| x.charAt(i)=='`'|| 
				   x.charAt(i)==';'|| x.charAt(i)=='.'|| x.charAt(i)==','|| x.charAt(i)=='?'|| x.charAt(i)=='°'|| x.charAt(i)=='ª')  {
					System.out.println("Achou caracter");
				}
			
			System.out.println(x.charAt(i));
			}
			return true;
		}

	}

}

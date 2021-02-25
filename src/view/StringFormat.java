package view;
import java.util.Locale;
import java.util.Scanner;

public class StringFormat {

	

	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);

			int x= input.nextInt();
			double  y = input.nextDouble();
			double pi = 3.14159;
		  
			double mediaKm = x/y;
			String media = String.format("%.3f %s",mediaKm,"km/l" );
			System.out.println(media);
			
	}
		}




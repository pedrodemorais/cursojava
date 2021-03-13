package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		float numeroDigitado=0f;
		int qtdNotaDe100=(int)numeroDigitado/100;
		int qtdNotaDe50=0;
		int qtdNota20=0;
		int qtdNota10=0;
		int qtdNota5=0;
		int qtdNota2=0;
		int moeda1=0;
		int moeda050=0;
		int moeda025=0;
		int moeda010=0;
		int moeda05=0;
		int moeda01=0;
		
		numeroDigitado = sc.nextFloat();
		qtdNotaDe100=(int)numeroDigitado/100;
		qtdNotaDe50=(int)numeroDigitado/50 - (2*qtdNotaDe100);
		qtdNota20=(int) Math.abs(((qtdNotaDe100 *100) + (qtdNotaDe50*50)-numeroDigitado)/20);
		qtdNota10=(int) ((int) Math.abs((qtdNotaDe100*100)+(qtdNotaDe50*50)+(qtdNota20*20)-numeroDigitado)/10);
		qtdNota5=(int) ((int) Math.abs((qtdNotaDe100*100)+(qtdNotaDe50*50)+(qtdNota20*20)+(qtdNota10*10)-numeroDigitado)/5);
		qtdNota2=(int) ((int) Math.abs((qtdNotaDe100*100)+(qtdNotaDe50*50)+(qtdNota20*20)+(qtdNota10*10)+(qtdNota5*5)-numeroDigitado)/2);
		
		System.out.println("NOTAS:");
		System.out.println(qtdNotaDe100+" nota(s) de R$ 100.00");
		System.out.println(qtdNotaDe50+" nota(s) de R$ 50.00");
		System.out.println(qtdNota20+" nota(s) de R$ 20.00");
		System.out.println(qtdNota10+" nota(s) de R$ 10.00");
		System.out.println(qtdNota5+" nota(s) de R$ 5.00");
		System.out.println(qtdNota2+" nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		
		moeda1=(int) ((int) Math.abs((qtdNotaDe100*100)+(qtdNotaDe50*50)+(qtdNota20*20)+(qtdNota10*10)+(qtdNota5*5)+(qtdNota2*2)-numeroDigitado));
		
		int numFracionario = (int)numeroDigitado;
		numFracionario =(int)Math.round((numeroDigitado - (int)numeroDigitado)*100) ;
		
		moeda050=numFracionario/50;
		moeda025=(numFracionario - (moeda050*50))/25;
		moeda010=(numFracionario -(moeda050*50)-(moeda025*25))/10;
		moeda05=(numFracionario -(moeda050*50)-(moeda025*25)-(moeda010*10))/5;
		moeda01=(numFracionario -(moeda050*50)-(moeda025*25)-(moeda010*10)-(moeda05*5));
		
		System.out.println(moeda1+" moeda(s) de R$ 1.00");
		System.out.println(moeda050+" moeda(s) de R$ 0.50");
		System.out.println(moeda025+" moeda(s) de R$ 0.25");
		System.out.println(moeda010+" moeda(s) de R$ 0.10");
		System.out.println(moeda05+" moeda(s) de R$ 0.05");
		System.out.println(moeda01+" moeda(s) de R$ 0.01");
		
		
		sc.close();

	}

}
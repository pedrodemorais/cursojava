package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {
		
		Scanner input= new Scanner(System.in);
		
		Date birthD0;
		Date birthD1;
		Date birthD2;
		Date currentDate = new Date();//Recebendo uma data com a hora e data atual;
		Date currentDate1 = new Date(System.currentTimeMillis());//Recebendo uma data com a hora e data atual em milissegundos;
		Date currentDate2 = new Date(0l);//Recebendo uma data em milessegundos;
		Date currentDate3 = new Date(1000l * 60l *60l * 5l);//Criando uma data as 5 da manha de 01 de janeiro de  1970;
		Date currentDate4 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//z significa padrão UTC, ele está imprimindo a data no padrão UTC

		
		String birthDate ="23/11/1984";
		String birthDate1 = "23/11/1984 10:52:15";
		
		//SimpleDateFormat pega o valor digitado como string e passa para o tipo date;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//Setando o time zone UTC, vai imprimir o horário sem as 3 horas de diferença
		
		//Variavel birthD do tipo Date recebendo a conversão do SimpleDateFormat de String para Date
		
		System.out.println("------------- Imprimindo sem usar sdf.format() -----------------------");
		
		birthD1=sdf1.parse("23/11/1984 10:25");
		System.out.println("birthD1: "+birthD1);
		
		birthD0=sdf.parse(birthDate);
		System.out.println("birthD0: "+birthD0);
		
		birthD2=sdf2.parse(birthDate1);
		System.out.println("birthD2: "+birthD2);
		
		
		//Imprimindo no formato Digitado 
		System.out.println("------------- Imprimindo usando o sdf.format() -----------------------");
		System.out.println("birthD1: "+sdf.format(birthD1));
		System.out.println("birthD0: "+sdf1.format(birthD0));
		System.out.println("birthD2: "+sdf2.format(birthD2));
		System.out.println("\n\ncurrentDate2: "+sdf2.format(currentDate2));
		System.out.println("currentDate3: "+sdf2.format(currentDate3));
		System.out.println("currentDate4: "+sdf2.format(currentDate4));
		System.out.println("currentDate4: "+sdf3.format(currentDate4));
		
		System.out.println("\n\nData e Hora Atual: "+sdf2.format(currentDate));
		System.out.println("Data e Hora Atual GMT: "+sdf3.format(currentDate));
		System.out.println("Data e Hora Atual: "+currentDate);
		System.out.println("Data e Hora Atual com milesegundos: "+sdf2.format(currentDate1));
		
		
	}

}

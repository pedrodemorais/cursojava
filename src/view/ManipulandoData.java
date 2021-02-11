package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ManipulandoData {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf1.parse("25/12/2020");
		Date y2 = sdf2.parse("25/11/1984 15:30:08");
		
		System.out.println("y1: "+ y1);
		System.out.println("y1: "+ sdf2.format(y2));
		
		System.out.println("y2: "+ y2);
		System.out.println("y2: "+ sdf2.format(y2));
		
		Date x1 = new Date();//vai criar uma data com o horário atual
		System.out.println("x1: "+x1);
		
		Date x2 = new Date(System.currentTimeMillis()); //vai criar uma data e converter em milisegundos
		System.out.println("x2: "+x2);
		
		Date x3 = new Date(0L); 
		System.out.println("x3: "+ sdf2.format(x3));
		Date x4 = new Date(1000L * 60L *  60L *5L);
		System.out.println("X4: "+ sdf2.format(x4));
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("y3: "+ sdf3.format(y3));
	}
	}

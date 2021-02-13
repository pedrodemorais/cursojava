package view;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SomarOuDiminuirUnidadeTempo {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d = Date.from(Instant.parse("1984-11-23T15:42:02Z"));
		
		System.out.println(sdf2.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 36);//acrescentando horas ou dias na data
		d=cal.getTime();
		
		System.out.println(sdf2.format(d));
		
		//pegando um valor de uma data
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Os minutos são: "+minutes);
		
		int hors = cal.get(Calendar.HOUR);
		System.out.println("As horas são: "+hors);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("O dia é: "+day);

		int day1 = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("O dia é: "+day1);
		
		int month =1+ cal.get(Calendar.MONTH);
		System.out.println("O dia é: "+month);
	
	}

}

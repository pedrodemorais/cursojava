package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarCurso {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date;
		Date x;
		
		date="23/11/1984";
		x=sdf.parse(date);
		System.out.println(sdf.format(x));
		
		Calendar cal = Calendar.getInstance();//aqui tenho um calendario com a minha data estanciada dentro dele
		                                     //Nesse caso posso acrescentar, diminuir o tempo que eu quiser	
		cal.setTime(x);
		cal.add(Calendar.DAY_OF_MONTH, 5);//acrescentando 5 dias na minha data
		x=cal.getTime();
		System.out.println(sdf.format(x));
		
		System.out.println("------------------------------------------------------------");
		Calendar cal1 = Calendar.getInstance();
		x=cal1.getTime();
		int y = cal1.get(Calendar.MINUTE);
		int z = cal1.get(Calendar.HOUR_OF_DAY);
		int dayOfMonth = cal1.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal1.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cal1.get(Calendar.DAY_OF_YEAR);
		int month = cal1.get(Calendar.MONTH);
		
		System.out.println(sdf.format(x));
		System.out.println("Minutos: "+y);
		System.out.println("Horas: "+z);
		System.out.println("Dia do Mes: "+dayOfMonth);
		System.out.println("Dia da Semana: "+dayOfWeek);
		System.out.println("Dia do Ano: "+dayOfYear);
		System.out.println("Mês do Ano: "+(month+1));
		
		
		
		
		
		
		

	}

}

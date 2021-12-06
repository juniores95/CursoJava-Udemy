package Application;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
				
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		cal.add(Calendar.DAY_OF_MONTH, 5);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.YEAR, 5);
		
		d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month " + month);
	}

}

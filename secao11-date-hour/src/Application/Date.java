package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

public class Date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");		
		java.util.Date atual = new java.util.Date();
		java.util.Date atual2 = new java.util.Date(System.currentTimeMillis());
		java.util.Date x1 = new java.util.Date(0L);
		java.util.Date x2 = new java.util.Date(1000L * 60L * 60L * 5L);		
		java.util.Date x3 = new java.util.Date().from(Instant.parse("2018-06-25T15:42:07Z"));
		
		
		
		System.out.println("------------------------------");
		System.out.println("Atual 1: " + sdf2.format(atual));
		System.out.println("Atual 2: " + sdf2.format(atual2));
		
		System.out.println("y1 :" + sdf1.format(y1));
		System.out.println("y2 :" + sdf2.format(y2));
		
		System.out.println("x1 :" + sdf2.format(x1));
		System.out.println("x2 :" + sdf2.format(x2));
		System.out.println("x3 :" + sdf2.format(x3));
		
		System.out.println("------------------------------");
		System.out.println("Atual 1: " + sdf3.format(atual));
		System.out.println("Atual 2: " + sdf3.format(atual2));
		
		System.out.println("y1 :" + sdf3.format(y1));
		System.out.println("y2 :" + sdf3.format(y2));
		
		System.out.println("x1 :" + sdf3.format(x1));
		System.out.println("x2 :" + sdf3.format(x2));
		System.out.println("x3 :" + sdf3.format(x3));
		
		System.out.println("------------------------------");
		System.out.println("Atual 1: " + atual);
		System.out.println("Atual 2: " + atual2);
		
		System.out.println("y1 :" + y1);
		System.out.println("y2 :" + y2);
		
		System.out.println("x1 :" + x1);
		System.out.println("x2 :" + x2);
		System.out.println("x3 :" + x3);
		
		//Comentario para giy HUb ...
		
		
	}

}

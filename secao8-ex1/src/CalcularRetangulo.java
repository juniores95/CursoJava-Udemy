import java.util.Locale;
import java.util.Scanner;

import rectangle.rectangle;

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		rectangle rt = new rectangle();
		
		System.out.print("Rectangle width : ");
		rt.width = sc.nextDouble();
		
		System.out.print("Rectangle heigth : ");
		rt.heigth = sc.nextDouble();
		
		System.out.println("rectangle area  : " + rt.area());
		
		System.out.println("rectangle perimeter  : " + rt.perimetro());
		
		System.out.println("rectangle diagonal  : " + rt.diagonal());
		
		sc.close();
		

	}

}

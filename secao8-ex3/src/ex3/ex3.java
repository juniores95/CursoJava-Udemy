package ex3;

import java.util.Locale;
import java.util.Scanner;

import Student.Student;

public class ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Student sd = new Student();

		System.out.println("Student name :");

		sd.name = sc.nextLine();

		System.out.println("Inform grade 1: ");

		sd.n1 = sc.nextDouble();

		System.out.println("Inform grade 2: ");

		sd.n2 = sc.nextDouble();

		System.out.println("Inform grade 3: ");

		sd.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE " + sd.media());
		System.out.println(sd.toString());
		
		sc.close();
	}
	

}

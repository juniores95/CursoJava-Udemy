package ex2;

import java.util.Locale;
import java.util.Scanner;

import employee.employee;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		employee ep = new employee();
		
		System.out.println("Name: ");
		ep.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		ep.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		ep.tax = sc.nextDouble();
		
		System.out.println("Employee " + ep.toString());
		
		System.out.println("Which percentage to increase salary? ");
		ep.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + ep.toString());
		
		sc.close();

	}

}

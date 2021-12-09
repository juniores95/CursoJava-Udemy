package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;
import entitites.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int qt = sc.nextInt();
		
		for(int i = 1; i<=qt; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Outsourced (y/n)? ");
			char r = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();				 
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per Hour");
			double valuePerHour = sc.nextDouble();
			
			if(r == 'y' ) {				
				
				System.out.print("Additional charge: ");
				double add = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, add));
				
			}else {	
				
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS: ");
		for(Employee c : list) {
			System.out.println(c);
		}
		
		
		sc.close();
	}

}

package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.employee;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<employee> list = new ArrayList<>();
		
		
		
		System.out.println("How many employees will be registered? ");
		int client = sc.nextInt();
		
		for(int i = 0; i <client; i++) {
			
			System.out.println("Employee #" + (i+1) + ";");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name  = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee ep = new employee(id, name, salary);
			list.add(ep);						
		}
		
		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idclient = sc.nextInt();
		
		//Outras maneiras de percorrer a lista
		 /*
		 Integer pos = position(list, idclient);
		 if(pos == null) {
			 System.out.println("This id does not exist.....");
		 }else {
			 System.out.print("Enter the percentege: ");
			 double percentege = sc.nextDouble();
			 list.get(pos).increaseSalary(percentege);
		 }
		 */
		employee result = list.stream().filter(x -> x.getId() == idclient).findFirst().orElse(null);
		if (result == null) {
			System.out.println("This id does not exist.....");
		}else {
			for(employee x : list) {
				if(x.getId() == idclient) {
					System.out.print("Enter the percentege: ");
					double percentege = sc.nextDouble();
					x.increaseSalary(percentege);
				}
			}
		}
						
		
		
		System.out.println("-----------------------");
		System.out.println("List of employees: ");
		for(employee x : list) {
			System.out.println("Id: " + x.getId() + " Name: " + x.getName() + " Salary: " + String.format("%.2f", x.getSalary()));
		}
		
		sc.close();
	}
	
	//Outras maneiras de percorrer a lista
	/*
	public static Integer position(List<employee> list, int id) {
		for (int i = 0; i < list.size(); i ++) {
			if(list.get(i).getId() == id) {
				return i;
			}			
		}
		return null;
	}
	*/
}

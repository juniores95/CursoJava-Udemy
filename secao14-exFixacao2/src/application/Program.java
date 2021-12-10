package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		List<TaxPayer> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the number of tax payers:");
		int payers = sc.nextInt();
		
		for(int i=1; i<=payers;i++) {
			System.out.println("Tax payer # "+i+"data:");
			System.out.printf("Individual or company (i/c)? ");
			char r = sc.next().charAt(0);
			
			System.out.printf("Name: ");
			String name = sc.next();
			
			System.out.printf("Anual income: ");
			double anual = sc.nextDouble();
			
			if(r == 'c') {
				System.out.printf("Number of employees: ");
				int employees = sc.nextInt();
				
				list.add(new Company(name, anual, employees));				
				
			}else {
				System.out.printf("Health expenditures: ");
				double health = sc.nextDouble();
				
				list.add(new Individual(name, anual, health));
			}
		}
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for(TaxPayer c : list) {
			System.out.println(c.getName() + ": $" + String.format("%.2f", c.tax()));
			sum += c.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();

	}

}

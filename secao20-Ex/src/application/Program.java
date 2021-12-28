package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "D:\\Arquivos\\Arquivos PC\\Arquivos\\GitProjetos\\Projetos-Estudos\\Curso Java Udemy\\teste.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> ListEp = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				ListEp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.printf("Eneter salary:");
			double salary = sc.nextDouble();
			
			List<String> ste = ListEp.stream()
					.filter(e-> e.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than " + salary);
			
			ste.forEach(System.out::println);
			System.out.println();
			
			System.out.printf("Enter letter:");
			char letter = sc.next().charAt(0);
			
			double totalSalary = ListEp.stream()
					.filter(e -> e.getName().charAt(0) == Character.toUpperCase(letter))
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with  '" + Character.toUpperCase(letter) + "': " + totalSalary);
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

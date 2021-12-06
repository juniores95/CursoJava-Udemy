package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta cta;
		
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();		
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		
		
		System.out.println("Is there na initial deposit (y/n): ");
		char initial = sc.next().charAt(0);
		
		if(initial == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			cta = new Conta(number, name, balance);
			
		}else {
			cta = new Conta(number, name);
			
		}
		
		System.out.println("Account data: ");
		System.out.println(cta.toString());
		
		System.out.println("Enter a deposit value: ");
		cta.incrementbalance(sc.nextDouble());
		
		System.out.println("Update data: ");
		System.out.println(cta.toString());
		
		System.out.println("Enter a withdraw value: ");
		cta.withdrawbalance(sc.nextDouble());
		
		System.out.println("Update data: ");
		System.out.println(cta.toString());
		
		
		sc.close();
		
		
	}

}

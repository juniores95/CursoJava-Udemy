package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.execeptions.Exceptions;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {			
			System.out.println("Enter account data");		
			System.out.printf("Number: ");
			int number = sc.nextInt();
			System.out.printf("Holder: ");
			String holder = sc.next();
			System.out.printf("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.printf("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account ct = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println("Enter amount for withdraw: ");
			ct.withdraw(sc.nextDouble());
			System.out.printf("Novo saldo: %.2f%n", ct.getBalance());
		}catch(Exceptions e){
			System.out.println(e.getMessage());
		}
	}

}

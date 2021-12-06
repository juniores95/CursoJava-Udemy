package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? : ");
		double price_dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? : ");
		
		double amount_dollars = sc.nextDouble();
		System.out.println("Amount 	to be paid in reais = " + String.format("%.2f", CurrencyConverter.calc(price_dollar, amount_dollars)));
		
		sc.close();

	}

}

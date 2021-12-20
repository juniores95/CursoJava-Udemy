package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contracts;
import model.entities.Installment;
import model.services.ContractServices;
import model.services.ServicePaypal;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		
		Contracts ct = new Contracts(number, date, value);
		
		System.out.println("Enter number of installments: ");
		int installments = sc.nextInt();
		
		ContractServices cs = new ContractServices(new ServicePaypal());
		
		cs.processContract(ct, installments);
		
		
		System.out.println("Installments: ");
		
		for(Installment x : ct.getList()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}

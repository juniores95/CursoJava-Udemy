package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Orderitem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter Cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client cl = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(new Date(), status, cl);
	
		System.out.print("How many items to this order? ");
		int qt = sc.nextInt();
		
		for(int i = 1; i<=qt; i++) {
			System.out.println("Enter #"+ i + " item date: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameP = sc.next();
			System.out.print("Product price: ");
			double priceP = sc.nextDouble();
			System.out.print("Quantity");
			int qtp = sc.nextInt();
			
			Orderitem orderitem = new Orderitem(qtp, priceP, new Product(nameP, priceP));
			order.addItem(orderitem);
			
		}
		
		System.out.println();
				
		System.out.println(order);
		
		sc.close();
		
		
		

	}

}

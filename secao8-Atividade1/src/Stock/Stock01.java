package Stock;

import java.util.Locale;
import java.util.Scanner;

import Product.Product;

public class Stock01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Enter product data: ");
		
		Product pd = new Product();
		
		System.out.print("Name: ");
		pd.name = sc.nextLine();
		System.out.print("Price: ");
		pd.price = sc.nextDouble();
		System.out.print("Quantily: ");
		pd.quantily = sc.nextInt();
		
		System.out.println(pd.toString());
		
		System.out.println("Enter the number of products to be added in stock: " );
		pd.addProducts(sc.nextInt());

		System.out.println("Update data: " + pd.toString());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		pd.removeProducts(sc.nextInt());
		
		System.out.println("Update data: " + pd.toString());
		
		
		sc.close();
	}

}

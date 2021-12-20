package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		String path = "D:\\Arquivos\\Arquivos PC\\Arquivos\\GitProjetos\\Projetos-Estudos\\Curso Java Udemy\\produtos.txt";
		
		File parent = new File(path);
		String parentString = parent.getParent();
		
		boolean success = new File(parentString + "\\out").mkdir();
		
		parentString += "\\out\\\\teste.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {				
				String[] prod = line.split(",");
				String name = prod[0];
				double price = Double.parseDouble(prod[1]);
				int quantity = Integer.parseInt(prod[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(parentString, true))){
				
				for(Product item : list) {
					bw.write(item.getName() + " " + item.getPrice() + " Total: " + item.total());
					bw.newLine();
				}
				
				System.out.println(parentString + " Created!!");
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		sc.close();
		
		
		

	}

}

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		String path = "D:\\Arquivos\\Arquivos PC\\Arquivos\\GitProjetos\\Projetos-Estudos\\Curso Java Udemy\\TCS.txt";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}
}

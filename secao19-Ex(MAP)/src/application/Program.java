package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidates = new LinkedHashMap<>();
		
		
		
		String path = "D:\\Arquivos\\Arquivos PC\\Arquivos\\GitProjetos\\Projetos-Estudos\\Curso Java Udemy\\teste.txt";
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			
			while(line != null) {
				String[] cand = line.split(",");
				if(candidates.containsKey(cand[0])) {
					candidates.put(cand[0], Integer.parseInt(cand[1]) + candidates.get(cand[0]));
					
					
				}else {
					candidates.put(cand[0], Integer.parseInt(cand[1]));
					
				}
				line = br.readLine();
				
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(String key : candidates.keySet()) {
			System.out.println(key + ": " + candidates.get(key));
		}
		
		
		sc.close();

	}

}

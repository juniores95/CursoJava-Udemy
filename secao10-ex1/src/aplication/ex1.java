package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.client;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		client[] rooms = new client[10] ;
		
		
		System.out.println("How many rooms will be rented? ");
		int client = sc.nextInt();
		
		for (int i = 1; i <=client; i++) {
			
			System.out.println("Rent #" + i);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new client(name, email, room);
			
		}
		
		for( int i = 0; i <rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println("Rooms " + i + " Name: " + rooms[i].getNome() + ", Email: " + rooms[i].getEmail() + ", Room: " + rooms[i].getRoom());
				System.out.println("");
			}		
			
		}
		
		sc.close();
		
		
		
		
		
	}

}

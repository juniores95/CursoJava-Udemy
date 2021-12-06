package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Number lines:");
		int l = sc.nextInt();
		
		System.out.print("Number columns:");
		int c = sc.nextInt();
		
		int [][] matr = new int[l][c];

		for(int i = 0; i < matr.length; i++) {
			for(int j = 0; j < matr[i].length; j++) {
				matr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Search number: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < matr.length; i++) {
			for(int j = 0; j < matr[i].length; j++) {
				if(matr[i][j] == number) {
										
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matr[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matr[i-1][j]);
					}
					if (j < matr[i].length-1) {
						System.out.println("Right: " + matr[i][j+1]);
						System.out.println(matr[i].length);
					}
					if (i < matr.length-1) {
						System.out.println("Down: " + matr[i+1][j]);
						System.out.println(matr[i].length);
					}
								
					
				}				
			}
		}
	}

}

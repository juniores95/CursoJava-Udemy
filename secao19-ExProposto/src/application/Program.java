package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Cursos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Cursos> cA = new HashSet<Cursos>();
		Set<Cursos> cB = new HashSet<Cursos>();
		Set<Cursos> cC = new HashSet<Cursos>();
		
		System.out.printf("How many stundents for course A? ");
		int nA = sc.nextInt();
		for(int i = 1; i<= nA; i++) {
			cA.add(new Cursos(sc.nextInt()));
		}
		
		System.out.printf("How many stundents for course B? ");
		int nB = sc.nextInt();
		for(int i = 1; i<= nB; i++) {
			cB.add(new Cursos(sc.nextInt()));
		}
		
		System.out.printf("How many stundents for course C? ");
		int nC = sc.nextInt();
		for(int i = 1; i<= nC; i++) {
			cC.add(new Cursos(sc.nextInt()));
		}
		Set<Cursos> total = new HashSet<Cursos>(cA);		
		total.addAll(cB);
		total.addAll(cC);
		System.out.printf("Course :" + cA.size() + " " + cB.size() + " " + cC.size());
		System.out.printf(" Total Stundents " + total.size());
		sc.close();
	}

}

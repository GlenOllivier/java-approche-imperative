package fr.declaration.variable;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int nb;
		do {
			System.out.println("entrez un nombre entre 1 et 10");
			nb = scanner.nextInt() ;
		} while(nb < 1 || nb > 10);
		System.out.println(nb);
		scanner.close();
	}
}

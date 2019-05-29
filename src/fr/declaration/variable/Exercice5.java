package fr.declaration.variable;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("entrez un nombre");
		int nb = scanner.nextInt() ;
		for(int i = 1; i <= 10; i++) {
			System.out.println(nb + i);
		}
		
		scanner.close();
	}

}

package fr.declaration.variable;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("entrez un nombre");
		int nb = scanner.nextInt() ;
		int somme = 0;
		for(int i = 1; i <= nb; i++) {
			somme += i;
		}
		
		System.out.println(somme);
		scanner.close();
	}

}

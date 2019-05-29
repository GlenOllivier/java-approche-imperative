package fr.declaration.variable;

public class Exercice2 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int somme = 0;
		for(int i = 0; i < array.length; i++) {
			somme += array[i];
		}
		System.out.println("moyenne du tableau : " + 1.0*somme / array.length);
	}

}

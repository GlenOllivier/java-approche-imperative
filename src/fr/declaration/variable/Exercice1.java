package fr.declaration.variable;

public class Exercice1 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("tableau :");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("tableau inverse :");
		for(int i = array.length - 1; i >= 0 ; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("> 3 :");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("nombres pairs :");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("idexs pairs :");
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("nombres impairs :");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("nombre max : " + max);
		
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("nombre min : " + min);

	}

}

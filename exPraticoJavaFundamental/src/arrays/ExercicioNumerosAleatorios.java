package arrays;

import java.util.Random;

public class ExercicioNumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		int [] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Números aleatórios: ");
		for(int numero : numerosAleatorios) {
			System.out.println(numero + " ");
		}
		
		System.out.println("\nSucessore de números aleatórios: ");
		for(int numero : numerosAleatorios) {
			System.out.println((numero+1) + " ");
		}
		System.out.println("\nAntecessor de números aleatórios: ");
		for(int numero : numerosAleatorios) {
			System.out.println((numero-1) + " ");
		}
	}

}

package loop;

import java.util.Scanner;

public class ExercicioParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadesNumero ;
		int numero;
		int quantidadeImpares = 0 , quantidadePares = 0;
		
		System.out.println("Quantidades de n�meros: ");
		quantidadesNumero = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) quantidadePares++;
			else quantidadeImpares++;
			
			count++;
		}while(count < quantidadesNumero);
		
		System.out.println("Quantidade pares : " + quantidadePares);
		System.out.println("Quantidade impares : " + quantidadeImpares);

		
	}
}

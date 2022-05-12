package arrays;

import java.util.Random;

public class ExercicioArrayMulti {

	public static void main(String[] args) {
		Random randow = new Random();
		
		int [][] m = new int[4][4];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = randow.nextInt(9);
			}
		}
		System.out.println("Matriz: ");
		for(int[] linha : m) {
			for(int coluna : linha) {
				System.out.println(coluna + " ");
			}
		}
		
	}

}

package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Principal{
	
	public static void main(String[] args)
	{
		//Declaração de Variaveis
		int mat [][] = new int [3][5];
		Random random = new Random();
		
		//Populando e exibindo valores da Matriz
		System.out.println("Matriz: ");
		for (int i = 0; i <= 2; i++)
		{
			for (int j = 0; j <= 4; j++)
			{
				mat[i][j] = random.nextInt(10);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n=========\n");
		
		//Chamando Thread com diferentes valores para x
		for (int x = 0; x <= 2; x++)
		{			
			Thread threadMatriz = new ThreadMatriz(x, mat);
			threadMatriz.start();
		}
	}

}
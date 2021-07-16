package Familia28;

import java.util.Scanner;

/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
 * 
 */

public class VetoresMatrizes10Ex04 {

	public static void main(String[] args) 
	{
		int [] [] matriz = new int [3] [3];
		
		Scanner leia =new Scanner(System.in);
		int somaDiagonal=0, somaTotal=0;
		
		for (int indexX = 0; indexX < 3; indexX++) 
		{
			for (int indexY = 0; indexY < 3; indexY++) 
			{
				System.out.println("\nInsira os valores das linhas: ");
				matriz[indexX][indexY] = leia.nextInt();
			}

		}
		for (int indexX = 0; indexX < 3; indexX++)
		{
			for (int indexY = 0; indexY < 3; indexY++) 
			{
				somaTotal+=matriz [indexX][indexY];
				if (indexX==indexY)
				{
					somaDiagonal+=matriz [indexX][indexY];
				}	
			}
		}
		System.out.println("\nA soma Diagonal é: "+somaDiagonal);
		System.out.println("\nA Soma Total é "+somaTotal); 
	}

}

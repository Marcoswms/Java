package Familia28;

import java.util.Scanner;

public class VetoresMatrizes10Ex01 {

	public static void main(String[] args) 
	{
		int[] valores = new int[5];
		
		int maior=0;
		
		Scanner leia = new Scanner(System.in);
	
		for (int x=0;x<5; x++)
		{
			System.out.println("\nDigite um Valor:");
			valores[x]=leia.nextInt();
			
		}
		
		for (int x=0;x<5;x++)
		{
		
			if (maior<valores[x])
			{
					maior=valores[x];
			}
		}
		System.out.println("\nO Valor maior é "+maior);
	}
		
}

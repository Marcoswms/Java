package Familia28;

/*	Construa um sistema para ler uma vari�vel num�rica; 
 * 	Imprimi-la somente se a mesma for maior que 100;
 * 	Caso contr�rio imprimi-la com o valor zero.
 */

import java.util.Scanner;

public class Laco_condicional_Ex_08 {

	public static void main(String[] args)
	{
		int numero;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nDigite um Numero:");
		
		numero=leia.nextInt();
		
		if(numero>=100)
		{
			System.out.println("\nO numero digitado �: "+numero);
		}
		else
		{
			numero=numero-numero;
			
			System.out.println("\nEste numero ter� o mesmo valor de: "+numero);
		}
	}

}

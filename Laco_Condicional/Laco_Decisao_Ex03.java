package Familia28;

/*	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
 * 	10-14 infantil
 * 	15-17 juvenil
 * 	18-25 adulto
 */

import java.util.Scanner;

public class Laco_Decisao_Ex03 {

	public static void main(String[] args) 
	{
		int idade;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEntre com a sua Idade: ");
		
		idade=leia.nextInt();
	
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nCategoria Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria Adulto");
		}
		else
		{
			System.out.println("\nSem Categoria");
		}
	}

}

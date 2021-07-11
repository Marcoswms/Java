package Familia28;

import java.util.Scanner;

/*	Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class Laco_Decisao_Ex01 {

	public static void main(String[] args) 
	{
		int n1,n2,n3;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nDigite o Primeiro Valor: ");
		n1=leia.nextInt();
		System.out.println("\nDigite o Segundo Valor: ");
		n2=leia.nextInt();
		System.out.println("\nDigite o Terceiro Valor: ");
		n3=leia.nextInt();
		
		if (n1!=n2 && n1!=n3)//else if (n1!=n2 and n1==3)
		{
			if (n1>n2 && n1>n3)
			{
				System.out.println("\nO maior numero é: "+n1);
			}
			else if	(n2>n1 && n2>n3)
			{
				System.out.println("\nO maior numero é: "+n2);
			}
			else if	(n3>n1 && n3>n2)
			{
				System.out.println("\nO maior numero é: "+n3);
			}
		}
		else if (n1!=n2 && n1==n3)
		{
			if (n2>n1)
			{
				System.out.println("\nO maior numero é: "+n2);
			}
			else
			{
				System.out.println("\nOs maiores numeros são: "+n1+" e "+n3);
			}
		}
		else if (n2!=n1 && n2==n3)
		{
			if (n1>n2)
			{
				System.out.println("\nO maior numero é: "+n1);
			}
			else
			{
				System.out.println("\nOs maiores numeros são: "+n2+" e "+n3);
			}
		}
		else if (n1==n2 && n1==n3)
		{
			System.out.println("\nOs maiores numeros são: "+n1+", "+n2+" e "+n3);
		}
		
		else
		{
			if (n3>n1)
			{
				System.out.println("\nO maior numero é: "+n3);
			}
			else
			{
				System.out.println("\nOs maiores numeros são: "+n1+" e "+n2); 
			}
		}
			
	}

}

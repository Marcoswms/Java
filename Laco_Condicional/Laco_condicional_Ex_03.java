package Familia28;

import java.util.Scanner;

/*	Desenvolva um sistema em que:
 * 	Leia 4 (quatro) n�meros;
 * 	Calcule o quadrado de cada um;
 * 	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
 * 	Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
 */

public class Laco_condicional_Ex_03 {

	public static void main(String[] args) 
	{
		int n1,n2,n3,n4,r1,r2,r3,r4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Primeiro n�mero: ");
		n1=leia.nextInt();
		System.out.println("\nDigite o Segundo n�mero: ");
		n2=leia.nextInt();
		System.out.println("\nDigite o Terceiro n�mero: ");
		n3=leia.nextInt();
		System.out.println("\nDigite o Quarto n�mero: ");
		n4=leia.nextInt();
		
		r1=n1*n1;
		r2=n2*n2;
		r3=n3*n3;
		r4=n4*n4;
		
		if(r3>=1000)
		{
			System.out.println("\nO Quadrado de "+n3+" �: "+r3);
		}
		else
		{
			System.out.println("\nO Quadrado de "+n1+" �: "+r1+", de "+n2+" �: "+r2+", de "+n3+" �: "+r3+" e de "+n4+" �: "+r4);
		}
	}

}

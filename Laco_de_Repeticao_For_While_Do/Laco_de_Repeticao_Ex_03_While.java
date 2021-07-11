package Familia28;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
*idade for = 99.
*/
public class Laco_de_Repeticao_Ex_03_While {

	public static void main(String[] args) 
	{
		int idade,menos21=0,mais50=0,neutro=0,cont=0;
		int res=0;
		Scanner leia = new Scanner(System.in);
		
		
		while(res<=99)
		{
			System.out.println("\nDigite a idade de uma pessoa: ");
			idade=leia.nextInt();
			res=res+idade;
			cont++;
			if (idade<=21)
			{
				menos21++;
			}
			if (idade>=50 && idade<=99)
			{
				mais50++;
			}
			if (idade>=22 && idade<=49)
			{
				neutro++;
			}
			
		}
			
		{
			System.out.println("\nContamos o total de: "+menos21+" com menos de 21 anos e: "+mais50+" com mais de 50 anos");
		}
		
	}

}

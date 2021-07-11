package Familia28;
/*		Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
import java.util.Scanner;

public class Lacos_de_Repeticao_Ex_02_For {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int quantidadePar = 0, quantidadeImpar = 0;
		
		for(int x = 1; x <= 10 ; x++) 
		{
			System.out.print("Entre com um numero: ");
			valor = leia.nextInt();
			
			if ( valor % 2 == 0 ) 
			{
				//quantidadePar = quantidadePar + 1;
				quantidadePar++;
			}
			else
			{
				//quantidadeImpar = quantidadeImpar + 1;
				quantidadeImpar++;
			}
		}
			System.out.print("\nQuantidade de Pares: "+quantidadePar+" // Quantidade de Ímpares: "+quantidadeImpar);
	}

}

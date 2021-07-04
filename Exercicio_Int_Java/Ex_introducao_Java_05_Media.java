package Familia28;

/*	Peso das Notas:
 * 	PesoN1:2
 *	PesoN2:3
 * 	PesoN3:5
 */

import java.util.Scanner;

public class Ex_introducao_Java_05_Media {

	public static void main(String[] args) 
	{
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1=leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2=leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3=leia.nextFloat();
		
		media = (n1/2)+(n2/3)+(n3/5);
		
		System.out.printf("\nA Média do aluno é: %2.2f",media);
	}

}

package Familia28;

import java.util.Scanner;

/* 	Ler três números inteiros e positivos (A, B, C);
 * 	Destes números, calcular a seguinte expressão:
 * 	S=(B+C)quad
 * 	R=(A+3)quad
 * 	D=(R+S)/2
 */

public class Ex_introducao_Java_04_Expressão {

	public static void main(String[] args) 
	{
		int A,B,C;
		double S,R,D;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nPara descobrir os Valores de D, R e S, inserir o valor de A: ");
		A=leia.nextInt();
		System.out.println("\nPara descobrir os Valores de D, R e S, inserir o valor de B: ");
		B=leia.nextInt();
		System.out.println("\nPara descobrir os Valores de D, R e S, inserir o valor de C: ");
		C=leia.nextInt();
		
		S=B+C;
		S=Math.pow(S, 2);
		R=A+3;
		R=Math.pow(R, 2);
		D=(R+S)/2;
		
		System.out.printf("\nO Resultado de D é: %2.2f",D);
		System.out.printf("\nO Resultado de R é: %2.2f",R);
		System.out.printf("\nO Resultado de S é: %2.2f",S);
	}

}

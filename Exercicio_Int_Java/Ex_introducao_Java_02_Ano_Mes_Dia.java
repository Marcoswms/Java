package Familia28;

import java.util.Scanner;

/*
 * 1 ano -- 365 dias
 * 1 mes--30 dias
 * 1 dia -- 1 dia
 */

public class Ex_introducao_Java_02 {

	public static void main(String[] args) 
	{
		int anos,meses,dias,totaldias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o total de dias: ");
		
		totaldias=leia.nextInt();
		
		anos=totaldias/365;
		meses=(totaldias%360)/30;
		dias=(totaldias%365)%30;
		
		System.out.println("\nEu vivi: "+anos+" ano(s) ,"+meses+" mes(es) e "+dias+" dias(s) de vida!");
		
	}

}

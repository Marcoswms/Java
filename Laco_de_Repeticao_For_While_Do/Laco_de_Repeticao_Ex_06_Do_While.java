package Familia28;

import java.util.Scanner;

/*    Escrever um programa que receba v�rios n�meros inteiros no teclado.
 *     No final imprimir a m�dia dos n�meros m�ltiplos de 3.
 *     Para sair digitar 0(zero).(DO...WHILE)
 * 
 */

public class Laco_de_Repeticao_Ex_06_Do_While {

    public static void main(String[] args) 
    {
        int num,media=0,multiplos=0,cont=0, soma= 0; 

        Scanner leia = new Scanner(System.in);

        do 
        {
            System.out.println("\nDigite um n�mero inteiro ou digite 0 para encerrar: ");
            num=leia.nextInt();

            if(num%3==0 && num != 0 )
            {
                multiplos++;
                soma = soma + num;

            }
            media = soma / multiplos;
        }

        while (num!=0);
        {

            System.out.println("M�dia: " + media);
            System.out.println("\nObrigade !!");
        }


    }

}

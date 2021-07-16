package orientacaoaobjetos;

import java.util.Scanner;

public class MainAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a Capacidade do Avião: ");
		aviao.capacidade=leia.nextInt();
		
		System.out.print("Digite o Tamanho do Avião: ");
		aviao.tamanho=leia.nextInt();
		
		System.out.print("Digite o Modelo do Avião: ");
		aviao.modelo=leia.next();
		
		System.out.print("Digite a cor do Avião: ");
		aviao.cor=leia.next();
		
		aviao.decola();
		aviao.inclina("esquerda");
		aviao.inclina("direita");
		aviao.pousa();
		
	}

}

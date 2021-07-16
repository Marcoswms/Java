package orientacaoaobjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Cliente cliente = new Cliente();
		
		Scanner leia = new Scanner(System.in);
		
		cliente.nome = leia.next();
		cliente.genero = leia.next();
		cliente.dataNasc = leia.next();
		
		cliente.mostraCliente();
		
		Cliente cliente2 = new Cliente();
		
		cliente2.nome = leia.next();
		cliente2.genero = leia.next();
		cliente2.dataNasc = leia.next();
		
		cliente2.mostraCliente();
	}

}

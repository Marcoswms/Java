package orientacaoaobjetos;

public class Aviao {

	String cor;
	int tamanho;
	int capacidade;
	String modelo;
	
	public void decola() {
		System.out.println("Este Avi�o Decola");
	}
	
	public void pousa() {
		System.out.println("Este Avi�o Pousa");
	}
	public void inclina(String direcao) {
		System.out.println("Este Avi�o Inclina para a: "+direcao);
	}
}

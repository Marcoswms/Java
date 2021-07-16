package orientacaoaobjetos;

public class Aviao {

	String cor;
	int tamanho;
	int capacidade;
	String modelo;
	
	public void decola() {
		System.out.println("Este Avião Decola");
	}
	
	public void pousa() {
		System.out.println("Este Avião Pousa");
	}
	public void inclina(String direcao) {
		System.out.println("Este Avião Inclina para a: "+direcao);
	}
}

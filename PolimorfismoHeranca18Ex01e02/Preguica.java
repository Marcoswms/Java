package animais;

public class Preguica extends Animal{
	
	public void sobeNaArvore() {
		System.out.println("Sobe na arvore");
	}

	@Override
	public void emitirSom() {
		// Segundo o video do link: https://www.youtube.com/watch?v=ZUnEoyIBuxM a preguiça grita :D
		System.out.println("Grita");
	}

}

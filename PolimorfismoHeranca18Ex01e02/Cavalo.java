package animais;

public final class Cavalo extends Animal implements Corredor {

	@Override
	public void emitirSom() {
		System.out.println("Relincha");
	}
}

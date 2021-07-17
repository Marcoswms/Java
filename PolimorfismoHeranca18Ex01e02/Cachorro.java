package animais;

public class Cachorro extends Animal implements Corredor{
	
	@Override
	public void emitirSom() {
		System.out.println("Late");
	}

}

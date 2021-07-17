package exercicio;

import animais.Animal;
import animais.Cachorro;
import animais.Cavalo;
import animais.Preguica;

public class MainEx2 {
	
	public static void main(String[] args) {
		executaEmitirSom(new Cachorro());
		executaEmitirSom(new Cavalo());
		executaEmitirSom(new Preguica());
	}
	
	private static void executaEmitirSom(Animal animal) {
		animal.emitirSom();
	}
}

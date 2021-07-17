package animais;

public interface Corredor {
	public default void corre() {
		System.out.println("Corre");
	}
}

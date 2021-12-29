package Collections;

public class exececao1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = null;
		String novaFrase = null;

		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) // captura de um possivel exceção
		{
			// tratamento da exceção
			
			System.out.println("\n A frase ");
			frase = "frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga :" + frase);
		System.out.println("\nFrase nova " + novaFrase);

	}
}

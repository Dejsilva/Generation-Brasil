package listajava3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		int numero, total = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o numero 0 para finalizar o programa");

		do {
			System.out.println("\nDigite um numero do teclado");
			numero = leia.nextInt();
			total = numero + total;

		} while (numero != 0);

		System.out.println("\nA soma dos numeros é de " + total);

	}
}

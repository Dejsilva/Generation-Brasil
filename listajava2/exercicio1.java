package listajava2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		int numero1, numero2, numero3;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEscreva o primeiro numero:");
		numero1 = leia.nextInt();
		System.out.println("\nEscreva o segundo numero:");
		numero2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro numero:");
		numero3 = leia.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO primeiro numero é o maior");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO segundo numero é o  maior ");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("\nO terceiro numero é o maior");
		}

	}

}

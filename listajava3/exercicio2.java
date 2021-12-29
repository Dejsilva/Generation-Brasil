package listajava3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		int numero, resto, contpar = 0, contimpar = 0, x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 10; x++) {
			System.out.println("\nInsira um numero:");
			numero = leia.nextInt();
			resto = numero % 2;

			if (resto == 0) {
				contpar++;
			} else {
				contimpar++;
			}
		}
		System.out.println("\nO numero de pares: " + contpar);
		System.out.println("\nO numero de impares " + contimpar);
	}
}

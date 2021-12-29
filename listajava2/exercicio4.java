package listajava2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		int numero, nd;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n Insira um numero: ");
		numero = leia.nextInt();
		nd = numero % 2;

		if (nd == 0) {
			System.out.println("\nO numero " + numero + " é um numero par ");
			System.out.println("\n A a raiz quadrada de " + numero + " é " + Math.sqrt(numero));
		} else {
			System.out.println("\nO numero " + numero + " é um numero impar");
			;
			System.out.println("\nO numero " + numero + " elevado ao quadrado é " + Math.pow(numero, 2));
		}

	}

}

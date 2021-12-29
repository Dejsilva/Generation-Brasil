package listajava3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		int numero, soma = 0, x, cont = 0;
		float media = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nInsira um numero:");
			numero = leia.nextInt();

			if (numero % 3 == 0) {
				soma = numero + soma;
				cont++;
			}
		} while (numero != 0);
		{
			if (cont == 0) {
				System.out.println("\n Não é possivel dividir por 0");
			} else {
				cont = cont - 1;
				media = soma / cont;
				System.out.printf("\nA media dos numeros multiplos de 3 é %.2f", media);

			}
		}
	}

}

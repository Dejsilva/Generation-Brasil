package listajava3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int idade, menor = 0, maior = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nPara finalizar o programa entre com o numero -99");
		System.out.println("\ncoloque sua idade:");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.println("\ncoloque sua idade:");
			idade = leia.nextInt();

			if (idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}
		System.out.println("\nO numero de pessoas menores de 21 anos é de " + menor);
		System.out.println("\nO numero de pessoas maiores que 50 anos é de " + maior);
	}
}

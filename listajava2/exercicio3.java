package listajava2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nQual a sua idade:");
		idade = leia.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nVocê se encaixa na categoria infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nVocê se encaixa na categoria juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("\nVocê se encaixa categoria adulta ");
		} else {

			System.out.println("\nVoce não se encaixa em nenhuma categoria");
		}

	}

}

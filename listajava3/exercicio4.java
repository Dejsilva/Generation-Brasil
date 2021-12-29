package listajava3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		int pessoas = 0, feminino, masculino, outros, calma, nervos, agressivel, x = 0, p;

		Scanner leia = new Scanner(System.in);

		while (pessoas < 5) {
			System.out.println("\nDigite 1 para feminino 2 para masculino e 3 para outros");
			x = leia.nextInt();
			System.out.println("\nDigite 1 para se você for calmo 2 nervoso e 3 agressivel");
			p = leia.nextInt();
			pessoas++;

		}
		if (x == 1) {

			x++;
		}
	}

}

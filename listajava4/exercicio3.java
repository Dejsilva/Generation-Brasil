package listajava4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int linha, coluna, cont = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.println("insira um numero :");
				matriz[linha][coluna] = leia.nextInt();

				if (matriz[linha][coluna] > 10) {
					cont++;
				}

			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				if (matriz[linha][coluna] > 10) {

					System.out.println("Valores maiores que 10 :" + matriz[linha][coluna]);
				}
			}
		}
		System.out.println("O numero de valores maior que 10 é de " + cont);
	}
}

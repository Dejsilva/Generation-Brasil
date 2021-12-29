package listajava4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int linha, coluna, op, numero;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {

				System.out.println("Insira os valores da primeira matriz :");
				matriz1[linha][coluna] = leia.nextFloat();
			}
		}
		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {

				System.out.println("Insira os valores da segunda matriz :");
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
		System.out.println("\n\t\tMenu de opções ");
		System.out.println("1:Para somar as duas matrizes");
		System.out.println("2:Para subtrair a primeira matriz da segunda");
		System.out.println("3:Adicionar um valor as matrizes");
		System.out.println("4:Para imprimir o valor das matrizes");

		do {
			System.out.println("\nEntre com a opção desejada");
			op = leia.nextInt();

			{
				while (op < 1 || op < 4)
					switch (op) {
					case 1:
						for (linha = 0; linha < 2; linha++) {
							for (coluna = 0; coluna < 2; coluna++) {
								matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
							}
							for (linha = 0; linha < 2; linha++) {
								for (coluna = 0; coluna < 2; coluna++)
									System.out.println("\n \t Soma " + matriz3[linha][coluna]);
							}
						}
						break;
					case 2:
						for (linha = 0; linha < 2; linha++) {
							for (coluna = 0; coluna < 2; coluna++) {
								matriz3[linha][coluna] = matriz2[linha][coluna] - matriz2[linha][coluna];
							}
							for (linha = 0; linha < 2; linha++) {
								for (coluna = 0; coluna < 2; coluna++)
									System.out.println("subtração" + matriz3[linha][coluna]);
							}
						}
						break;

					case 3:
						System.out.println("\nInsira o numero que deseja somar as matrizes");
						numero = leia.nextInt();

						for (linha = 0; linha < 2; linha++) {
							for (coluna = 0; coluna < 2; coluna++) {

								matriz1[linha][coluna] = numero + matriz1[linha][coluna];
								matriz2[linha][coluna] = numero + matriz2[linha][coluna];

								System.out.println("\nA soma do numero com a matriz1 é " + matriz1[linha][coluna]);
								System.out.println("\nA soma do numero com a matriz2 é " + matriz2[linha][coluna]);
							}
						}
					}
				break;
			}
		} while (op != 0);
	}
}

package listajava3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, resto;

		for (numero = 1000; numero <= 1999; numero++) {
			resto = numero % 11;

			if (resto == 5)

			{
				System.out.println(+numero + ",");

			}
		}
	}
}

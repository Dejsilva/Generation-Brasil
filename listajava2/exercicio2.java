package listajava2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		int numero1, numero2, numero3;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira o primeiro numero:");
		numero1 = leia.nextInt();
		System.out.println("\nInsira o segundo numero:");
		numero2 = leia.nextInt();
		System.out.println("\nInsira o terceiro numero:");
		numero3 = leia.nextInt();

		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("\nOrdem crescente " + numero1 + "," + numero2 + "," + numero3);
		} else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("\nOrdem crescente " + numero2 + "," + numero1 + "," + numero3);
		} else if (numero3 <= numero2 && numero2 <= numero1) {
			System.out.println("\nOrdem crescente " + numero3 + "," + numero2 + "," + numero1);
		} else if (numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("\nOrdem crescente " + numero2 + "," + numero3 + "," + numero1);
		} else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("\nOrdem crescente " + numero3 + "," + numero1 + "," + numero2);
		} else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("\nOrdem crescente " + numero1 + "," + numero3 + "," + numero2);
		}

	}

}

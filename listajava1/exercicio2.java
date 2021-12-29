package listajava1;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totald, anos, dias, meses;

		Scanner ler = new Scanner(System.in);

		System.out.println("\nQuantos dias você tem de vida :");
		totald = ler.nextInt();

		anos = totald / 365;
		meses = (totald % 365) / 30;
		dias = (totald % 365) % 30;

		System.out.println("\nVocê tem " + anos + " anos " + meses + " meses e " + dias + " dias");

	}

}

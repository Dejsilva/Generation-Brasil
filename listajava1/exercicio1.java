package listajava1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia, mes ,idade ,resultado;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("\nDigite sua idade :");
		idade=ler.nextInt();
		System.out.println("\nO mes de seu nascimento :");
		mes=ler.nextInt();
		System.out.println("\nO dia do seu nascimento :");
		dia=ler.nextInt();
		
		resultado = dia+(idade*365)+(30*mes);
		System.out.println("\nVocê esta aqui a " +resultado +" dias");
	
		
	}
	
}

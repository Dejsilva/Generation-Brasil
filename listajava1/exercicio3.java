package listajava1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stotais, segundos, minutos, horas;

		Scanner ler = new Scanner(System.in);
		System.out.println("segundos totais:");
		stotais = ler.nextInt();
		horas = stotais / 3600;
		minutos = (stotais - (horas * 3600)) / 60;
		segundos = stotais % 60;
		System.out.println("\nsão " + horas + ":" + minutos + ":" + segundos);

	}
}

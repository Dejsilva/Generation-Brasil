package listajava4;

public class exercicio1 {

	public static void main(String[] args) {

		int[] vetor = { 1, 0, 5, -2, -5, 7 };
		int soma, x;

		soma = vetor[0] + vetor[1] + vetor[5];

		vetor[4] = 100;

		for (x = 0; x < 6; x++) {
			System.out.println("O valor do vetor " + x + 1 + " é de " + vetor[x]);

		}
		System.out.println("A soma dos vetores 0, 1  e 5 é: " + soma);

	}

}

package listajava6;

public class cachorro extends animal {

	private String raca;
	private String racao;

	public cachorro(String nome, int idade, int velocidade, String som, String raca, String racao) {
		super(nome, idade, velocidade, som);
		this.raca = raca;
		this.racao = racao;
	}

	public void infocahorro() {
		System.out.println("\nNome do cachoro: " + getNome() + " \nIdade: " + getIdade() + " \nvelocidade: "
				+ getVelocidade() + "Km/h \nSom que emiti: " + getSom() + "\nRaça:" + raca + " \nRação:" + racao);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRacao() {
		return racao;
	}

	public void setRacao(String racao) {
		this.racao = racao;
	}
}

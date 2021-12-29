package listajava6;

public class cavalo extends animal {

	private String cor;
	private float altura;

	public cavalo(String nome, int idade, int velocidade, String som, String cor, float altura) {
		super(nome, idade, velocidade, som);
		this.cor = cor;
		this.altura = altura;
	}

	public void infocavalo() {
		System.out.println(
				"\nNome do cavalo: " + getNome() + " \nIdade: " + getIdade() + " \nvelocidade: " + getVelocidade()
						+ "Km/h \nSom que emiti: " + getSom() + "\nCor:" + cor + " \nAltura: " + altura + " metros");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}

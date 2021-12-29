package listajava6;

public class preguica extends animal {

	private String habitat;
	private String alimento;

	public preguica(String nome, int idade, int velocidade, String som, String habitat, String alimento) {
		super(nome, idade, velocidade, som);
		this.alimento = alimento;
		this.habitat = habitat;
	}

	public void infopreguica() {
		System.out.println(
				"\nNome da preguiça: " + getNome() + " \nIdade: " + getIdade() + " \nvelocidade: " + getVelocidade()
						+ "Km/h \nSom que emiti: " + getSom() + "\nhabitat: " + habitat + " \nAlimento: " + alimento);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
}
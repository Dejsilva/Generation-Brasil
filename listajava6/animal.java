package listajava6;

public class animal {

	private String nome;
	private int idade;
	private String som;
	private int velocidade;

	public animal(String nome, int idade, int velocidade, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.velocidade = velocidade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}

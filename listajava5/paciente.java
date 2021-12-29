package listajava5;

import java.util.Scanner;

public class paciente {

	Scanner leia = new Scanner(System.in);
	// Atributos

	private String nome;
	private String estado;
	private int diasInternado;
	private int diaAlta;

	public paciente(String n, String e, int di) {
		this.setNome(n);
		this.setEstado(e);
		this.setDiasInternado(di);

	}

	public void info() {
		System.out.println("\nPaciente:" + nome + "\nEstado:" + estado + "\nDias internados:" + diasInternado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getDiasInternado() {
		return diasInternado;
	}

	public void setDiasInternado(int diasInternado) {
		this.diasInternado = diasInternado;
	}

	public int getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(int diaAlta) {
		this.diaAlta = diaAlta;
	}

}

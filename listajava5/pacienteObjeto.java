package listajava5;

public class pacienteObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paciente p1 = new paciente("Bruna Fernandes", "Recuperado", 15);
		paciente p2 = new paciente("Vitor Rodrigues", "Critico", 12);
		paciente p3 = new paciente("Marcos Silva", "Estavel", 2);
		p1.info();
		p2.info();
		p3.info();

	}
}

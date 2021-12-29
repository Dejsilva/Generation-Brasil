package listajava6;

public class testeAnimais {

	public static void main(String[] args) {

		cachorro dog1 = new cachorro("Spike", 6, 20, "Lati", "Vira lata", " Pedigree");
		cavalo horse1 = new cavalo("Spirit", 11, 70, " relinchar", "Preto ", 2);
		preguica pre1 = new preguica("Jason", 33, 1, " Indevinido", "Mata Atlântica", "Folhas, frutas e seivas");
		cavalo1 cava = new cavalo1();
		cachorro1 cacho = new cachorro1();
		bichopreguica bicho = new bichopreguica();

		dog1.infocahorro();
		cacho.emiti(null);
		horse1.infocavalo();
		cava.emiti(null);
		pre1.infopreguica();
		bicho.emiti(null);

	}

}

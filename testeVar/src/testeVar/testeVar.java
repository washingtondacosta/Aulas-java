package testeVar;

public class testeVar {

	public static void main(String[] args) {

		Classe meuNome = new Classe();

		meuNome.nome = "Washington";

		Classe nomeOutro = new Classe();
		nomeOutro.nome = "Teste";

		meuNome.escreveNome();
		nomeOutro.escreveNome();

	}

}

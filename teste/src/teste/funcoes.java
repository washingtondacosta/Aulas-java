package teste;

public class funcoes {

	public int soma(int a, int b) {

		int resultado = a + b;
		System.out.println(resultado);
		return resultado;
	}

	public int fatorial(int f) {

		if (f == 0)
			return 1;

		int resultado = f * fatorial(f - 1);
		return resultado;
	}

}

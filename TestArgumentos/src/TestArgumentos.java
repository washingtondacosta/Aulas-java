import java.util.Scanner;

public class TestArgumentos {

	public static float media(float... valores) {
		float media = 0;

		for (float valor : valores) {

			media += valor;
		}

		return media / valores.length;
	}

	public static void main(String[] args) {
		float numero1, numero2, numero3, numero4, numero5;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero");
		numero1 = entrada.nextFloat();

		System.out.println("Entre com o segundo n�mero");
		numero2 = entrada.nextFloat();

		System.out.println("Entre com o terceiro n�mero");
		numero3 = entrada.nextFloat();

		System.out.println("Entre com o quarto n�mero");
		numero4 = entrada.nextFloat();

		System.out.println("Entre com o quinto n�mero");
		numero5 = entrada.nextFloat();

		System.out.println("M�dia dos n�meros digitados: " + media(numero1, numero2, numero3, numero4, numero5));

	}

}

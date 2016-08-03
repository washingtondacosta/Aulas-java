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

		System.out.println("Entre com o primeiro número");
		numero1 = entrada.nextFloat();

		System.out.println("Entre com o segundo número");
		numero2 = entrada.nextFloat();

		System.out.println("Entre com o terceiro número");
		numero3 = entrada.nextFloat();

		System.out.println("Entre com o quarto número");
		numero4 = entrada.nextFloat();

		System.out.println("Entre com o quinto número");
		numero5 = entrada.nextFloat();

		System.out.println("Média dos números digitados: " + media(numero1, numero2, numero3, numero4, numero5));

	}

}

package mediaProvas;

import java.util.Scanner;

public class mediaProvas {

	public static float media(float... valores) {

		float media = 0;

		for (float valor : valores) {

			media += valor;
		}

		return media / valores.length;

	}

	public static float maiornumero(float numero1, float numero2, float numero3) {

		if (numero1 >= numero2) {
			if (numero1 >= numero3)
				return numero1;
		} else {
			if (numero2 >= numero3)
				return numero2;
		}
		return numero3;

	}

	public static float menorNota(float numero1, float numero2, float numero3) {

		if (numero1 <= numero2) {
			if (numero1 <= numero3)
				return numero1;
		} else {
			if (numero2 <= numero3)
				return numero2;
		}
		return numero3;

	}

	public static void main(String[] args) {

		float nota1, nota2, nota3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o valor da primeira nota");
		nota1 = entrada.nextFloat();

		System.out.println("Entre com o valor da primeira nota");
		nota2 = entrada.nextFloat();

		System.out.println("Entre com o valor da terceira nota");
		nota3 = entrada.nextFloat();

		System.out.println("Sua maior nota foi: " + maiornumero(nota1, nota2, nota3));
		System.out.println("Sua menos nota foi: " + menorNota(nota1, nota2, nota3));
		System.out.println("Sua média é igual: " + media(nota1, nota2, nota3));

		System.out.println(
				"Súa média sem a menor nota: " + (media(nota1, nota2, nota3) - menorNota(nota1, nota2, nota3)));

	}

}

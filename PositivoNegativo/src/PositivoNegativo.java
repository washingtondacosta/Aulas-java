import java.util.Scanner;

public class PositivoNegativo {

	public static boolean isPositive(float num) {

		if (num > 0) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com umm n�mero");
		float numero = entrada.nextFloat();

		if (isPositive(numero)) {
			System.out.println("O numero digitado � um valor positivo");
		} else {
			System.out.println("O n�mero digitado � um valor negativo");
		}

	}

}

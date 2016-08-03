import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		float a, b, c, delta, sqrdelta, raiz1, raiz2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o coeficeinte de A");
		a = entrada.nextFloat();
		System.out.println("Entre com o coeficiente de B");
		b = entrada.nextFloat();
		System.out.println("Entre com o coeficiente de C");
		c = entrada.nextFloat();

		if (a > 0) {
			// Calculando o delta
			delta = (b * b) - (4 * a * c);
			// Calculando a raiz de delta
			sqrdelta = (float) Math.sqrt(delta);
			
			//Se delta maior que zero as raizes são reais
			if (delta >= 0) {
				raiz1 = ((-1) * b + sqrdelta) / (2 * a);
				raiz2 = ((-1) * b - sqrdelta) / (2 * a);
				System.out.printf("Raizes %.2f , %.2f", raiz1, raiz2);
			}//Se delta menor que 0 as raizes serão complexas 
			else {
				delta = -delta;
				sqrdelta = (float) Math.sqrt(delta);
				System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b) / (2 * a), (sqrdelta) / (2 * a));
				System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b) / (2 * a), (sqrdelta) / (2 * a));
			}
		} else {
			System.out.println("Valor de a inválido, insira um valor maior que 0");
		}
	}

}

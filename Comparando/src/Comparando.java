import java.util.Scanner;

public class Comparando {

	public static void main(String[] args) {
		
		float num1, num2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		
		num1 = entrada.nextFloat();
		
		System.out.println("Entre com o segundo n�mero");
		num2 = entrada.nextFloat();
		
		System.out.printf("%.2f > %.2f -> %s\n", num1,num2, num1 > num2);
		System.out.printf("%.2f >= %.2f -> %s\n", num1, num2, num1 >= num2);
		System.out.printf("%.2f < %.2f -> %s\n", num1,num2, num1 < num2);
		System.out.printf("%.2f <= %.2f -> %s\n", num1, num2, num1 < num2);
		System.out.printf("%.2f = %.2f -> %s\n", num1, num2, num1 == num2);
		System.out.printf("%.2f != %.2f -> %s\n", num1,num2, num1 != num2);

	}
}

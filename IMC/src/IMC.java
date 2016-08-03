import java.util.Scanner;

public class IMC {

	public static float IMC(float peso, float altura) {

		float IMC = peso / (altura * altura);

		return IMC;

	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor do peso");
		
		float peso = entrada.nextFloat();
		
		System.out.println("Entre com o valor da altura");
		
		float altura = entrada.nextFloat();
		
		float IMC = IMC(peso, altura);
		
		
		System.out.printf("O valor do IMC é igual %.2f",IMC);
		
	}

}

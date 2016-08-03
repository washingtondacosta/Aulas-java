import java.util.Scanner;

public class Conversao {

	public static float ConF(float C) {
		float F;

		F = (9 * C / 5) + 32;

		return F;
	}

	public static float ConC(float F) {
		float C;

		C = 5 * (F - 32) / 9;

		return C;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("\tMenu de opções");
			System.out.println("1 - Converter Celsius para Farenheit");
			System.out.println("2 - Converter Farenheit para Celsius");
			System.out.println("0 - Sair");
			opcao = entrada.nextInt();
			
			switch (opcao){
			
			case 1:
				System.out.println("Para converter infome a temperatura em Celsius");
				float valorC = entrada.nextFloat();
				System.out.println("O valor da temperatura "+valorC +"ºC para Farenheit é: " + ConF(valorC)+ "ºF");
				break;
			
			case 2:
				System.out.println("Para converter infome a temperatura em Farenheit");
				float valorF = entrada.nextFloat();
				System.out.println("O valor da temperatura "+valorF +"ºF para Farenheit é: " + ConC(valorF)+ "ºC");
				break;
				
			case 0:
				System.out.println("O programa será encerrado");
				
			default:
				System.out.println("Digite uma opção válida");
				
			}

		} while (opcao != 0);

	}

}

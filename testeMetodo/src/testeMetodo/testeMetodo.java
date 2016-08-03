package testeMetodo;

import java.util.Scanner;

public class testeMetodo {

	public static void menu() {
		System.out.println("\t Menu de opções\n" + "1. Incluir\n" + "2. Alterar\n" + "3. Excluir\n" + "4. Consultar\n"
				+ "5. Sair");
	}

	public static void incluir() {
		System.out.println("Você está no metodo incluir");
	}

	public static void alterar() {
		System.out.println("Você está no metodo alterar");
	}

	public static void excluir() {
		System.out.println("Você está no metodo excluir");
	}

	public static void consultar() {
		System.out.println("Você está no metodo consultar");
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {

			menu();
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:
				incluir();
				break;

			case 2:
				alterar();
				break;

			case 3:
				excluir();
				break;

			case 4:
				consultar();
				break;

			}

		} while (opcao != 5);

	}

}

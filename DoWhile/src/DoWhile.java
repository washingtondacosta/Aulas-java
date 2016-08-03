import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		boolean continuar = true;

		int opcao;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("\t\tMenu de opções do curso Java Progressivo");
			System.out.println("\t1. Ver Menu");
			System.out.println("\t2. Ler o Menu");
			System.out.println("\t3. Repetir o Menu");
			System.out.println("\t4. Tudo de novo");
			System.out.println("\t5. Não li, pode repetir?");
			System.out.println("\t0. Sair");

			System.out.println("\nInsira sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {

				continuar = false;
				System.out.println("Programa finalizado");

			} else {

				System.out.printf("\n\n\n\n\n\n");

			}

		} while (continuar);

	}
}

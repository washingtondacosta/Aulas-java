import java.util.Scanner;

public class ProjAluno {

	public static void main(String[] args) {

		String nome;
		Double notaFis, notaMat;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o nome do aluno");
		nome = entrada.nextLine();

		System.out.println("Entre com a nota de Fisica");
		notaFis = entrada.nextDouble();

		System.out.println("Entre com a nota de Matematica");
		notaMat = entrada.nextDouble();

		Aluno patropi = new Aluno(nome, notaFis, notaMat);
		
		System.out.printf("O aluno \"%s\", tirou %.2f em fisica\n"
				+ "e %.2f em Física\n"
				+ "a sua média é %.2f",patropi.nome,patropi.notaFis,patropi.notaMat,patropi.media );

	}

}

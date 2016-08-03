package quadrado;

import java.util.Scanner;

public class quadrado {

	public static int quadrado(int num) {

		return num * num;

	}
	
	public static void main(String[] args) {
		
		System.out.println("Entre com o numero");
		
		Scanner entrada = new Scanner (System.in);
		
		int numero = entrada.nextInt();
		
		int qnumero = quadrado(numero);
		
		System.out.printf("O valor do quadrado do numero %d é: %d",numero,qnumero);
	}

}

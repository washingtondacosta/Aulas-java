import java.util.Scanner;
import java.util.Random;

public class Caixa {
	
	public static void main(String[] args) {
		//Declarando váriaveis
		String nome;
		Double inicial;
		Scanner entrada = new Scanner(System.in);
		Random numero = new Random();
		int conta = 1 + numero.nextInt(9999);
		
		System.out.println("Cadastrando um novo cliente");
		System.out.println("Entre com o nome do titular");
		nome = entrada.nextLine();
		System.out.println("Saldo inicial da conta");
		inicial = entrada.nextDouble();
		
		Conta minhaConta = new Conta(nome, conta, inicial);
		
		minhaConta.iniciar();
		
		
		
	}

}

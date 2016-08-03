package resultadoNota;

import java.util.Scanner;

public class resultadoNota {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua nota? ");

		int nota = entrada.nextInt();

		if (nota <= 10 && nota >= 0){
			
			System.out.println("Nota válida");
			
			    if(nota >= 7){
				System.out.println("Parabéns, você passou direto. Já sei, você programa em java?");
			    }else{
				System.out.println("Não passou direto");
			    }
			    if (nota >= 5){
			    	System.out.println("Vai ter que fazer recuperação");
			    }else{
			    	System.out.println("Reprovado. Ainda bem que é só simulação, hein?");
			    }
		}else{
			System.out.println("Nota inválida, fechando programa");
		}

	}
}
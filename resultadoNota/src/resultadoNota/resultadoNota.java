package resultadoNota;

import java.util.Scanner;

public class resultadoNota {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua nota? ");

		int nota = entrada.nextInt();

		if (nota <= 10 && nota >= 0){
			
			System.out.println("Nota v�lida");
			
			    if(nota >= 7){
				System.out.println("Parab�ns, voc� passou direto. J� sei, voc� programa em java?");
			    }else{
				System.out.println("N�o passou direto");
			    }
			    if (nota >= 5){
			    	System.out.println("Vai ter que fazer recupera��o");
			    }else{
			    	System.out.println("Reprovado. Ainda bem que � s� simula��o, hein?");
			    }
		}else{
			System.out.println("Nota inv�lida, fechando programa");
		}

	}
}
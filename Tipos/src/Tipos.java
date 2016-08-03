import java.util.Scanner;


public class Tipos {
	
	public static void main(String[] args) {
		
		int letraJ = 74;
		char letraP = 80;
		System.out.println((char)letraJ);
		
		Scanner entrada = new Scanner (System.in);
		
		char caractere = entrada.nextLine().charAt(0);
		
		System.out.println(caractere);
		
	}

}

package teste;

public class teste {
	public static void main(String[] args) {
		
		int numero1 = 2;
		int numero2 = 10;
		
		int soma = numero1 + numero2;
		
		if ((numero1>numero2) && (numero1%numero2==0)){
			
			soma = soma * 10;
			System.out.println(soma);
		}
		
		if ((numero1<numero2) || (numero1%numero2==0)){
			
			soma = soma * 10;
			System.out.println(soma);
			
		}
	}
}

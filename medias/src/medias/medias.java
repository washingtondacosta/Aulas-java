package medias;
import java.util.Scanner;

public class medias {
	
	public static float media(float...valores){
		
		float media=0;
		
		for(float valor: valores){
            media +=valor;
        }
        
        return media/valores.length;
	}
	
	public static void main(String[] args){
        float valor1, valor2, valor3, valor4, valor5;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o valor 1: ");
        valor1 = entrada.nextFloat();
        System.out.print("Entre com o valor 2: ");
        valor2 = entrada.nextFloat();
        System.out.print("Entre com o valor 3: ");
        valor3 = entrada.nextFloat();
        System.out.print("Entre com o valor 4: ");
        valor4 = entrada.nextFloat();
        System.out.print("Entre com o valor 5: ");
        valor5 = entrada.nextFloat();
        
        
        System.out.println("A m�dia dos 5 n�meros �: "+media(valor1,valor2,valor3,valor4,valor5));
        System.out.println("A m�dia dos 4 primeiros n�meros �: "+media(valor1,valor2,valor3,valor4));
        System.out.println("A m�dia dos 3 primeiros n�meros �: "+media(valor1,valor2,valor3));
        System.out.println("A m�dia dos 2 primeiros n�meros �: "+media(valor1,valor2));
    }


}

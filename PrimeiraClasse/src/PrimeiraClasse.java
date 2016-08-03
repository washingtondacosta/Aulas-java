import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
        Aluno donaFifi = new Aluno();
        String nome;
        Double notaMat,
               notaFis;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Nome do aluno: ");
        nome = entrada.nextLine();
        
        System.out.print("Nota em Matemática: ");
        notaMat = entrada.nextDouble();
        
        System.out.print("Nota em Física: ");
        notaFis = entrada.nextDouble();
        
        Aluno patropi = new Aluno(nome, notaMat, notaFis);
        System.out.printf("O aluno \"%s\" tirou %2.2f em Matemática, "
                + "%2.2f em Física e obteve média %2.2f\n", patropi.nome,
                                                            patropi.notaMat,
                                                            patropi.notaFis,
                                                            patropi.media);
    }

}

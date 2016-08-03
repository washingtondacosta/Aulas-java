package composer;
import java.util.Scanner;
public class composer {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aluno:");
		String nome = entrada.nextLine();
		System.out.println("Entre com o código da disciplina");
		int disciplina = entrada.nextInt();
		
		aluno novoAluno = new aluno();
		novoAluno.setNome(nome);
		
		
		disciplina novaDisciplina = new disciplina();
		novaDisciplina.setCodDisciplina(disciplina);
		
		matricula novaMatricula = new matricula(novaDisciplina,novoAluno);
		
	}

}

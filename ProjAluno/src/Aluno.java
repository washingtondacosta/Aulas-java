
public class Aluno {

	String nome;
	Double notaFis,notaMat,media;

	Aluno() {
		System.out.println("Objeto Criado!");

	}
	
	Aluno (String Nome,Double NotaFis,Double NotaMat){
		
		notaFis = NotaFis;
		notaMat = NotaMat;
		nome = Nome;
		
		media = (notaFis + notaMat) / 2;
		
	}

}

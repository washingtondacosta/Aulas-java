package composer;

public class aluno {
	
	private String nome;
	
	public void setNome(String Nome){
		this.nome = Nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String toString(){
		return getNome();
	}

}

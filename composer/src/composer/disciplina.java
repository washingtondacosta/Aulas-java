package composer;

public class disciplina {
	
	private int codDisciplina;
	
	public void setCodDisciplina(int cod){
		this.codDisciplina = cod;
	}
	
	public int getCodDisciplina(){
		return this.codDisciplina;
	}
	
	public int disciplina(){
		return this.codDisciplina;
	}
	
	@Override
	
	public String toString(){
		return String.format("%d",getCodDisciplina());
	}

}

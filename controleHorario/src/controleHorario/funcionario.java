package controleHorario;

public class funcionario {

	private String nome;
	private boolean atraso;
	private double tempoTrabalhado, tempoAtraso;

	public funcionario(String nome, hora horaChegada, hora horaSaida) {

		this.nome = nome;
		this.tempoAtraso = tempoAtraso(horaChegada);

		if (this.tempoAtraso > 0)
			this.atraso = true;

		if (atraso) {
			System.out.println("Funcionário '" + this.nome + "' atrasado.");
		}
		this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);

	}

	public double tempoAtraso(hora horaChegada) {
		return ((horaChegada.getHora() * 60 * 60 + horaChegada.getMinutos() * 60 + horaChegada.getSegundos())
				- 8 * 3600.0) / 3600.0;
	}

	public double horasTrabalhadas(hora horaChegada, hora horaSaida) {
		double horas = ((horaSaida.getHora() * 60 + horaSaida.getMinutos())
				- (horaChegada.getHora() * 60 + horaChegada.getMinutos())) / 60.0;

		if (horas < 0)
			throw new IllegalArgumentException("Hora de saída anterior a hora de chegada");

		return horas;
	}
	
	public double getHorasTrabalhadas(){
        return this.tempoTrabalhado;
    }

}

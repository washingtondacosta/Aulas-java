package controleHorario;

public class hora {

	private int hora, minutos, segundos;

	public hora(int hora, int minutos, int segundos) {

		// preenchendo as horas

		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else
			throw new IllegalArgumentException("Hora inválida");

		if (minutos >= 0 && minutos < 60) {
			this.minutos = minutos;
		} else
			throw new IllegalArgumentException("Minutos inválidos");

		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		} else
			throw new IllegalArgumentException("Segundos inválidos");

	}

	public int getHora() {
		return this.hora;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public int getSegundos() {
		return this.segundos;
	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d", getHora(), getMinutos(), getSegundos());
	}

}

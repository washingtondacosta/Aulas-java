package controleHorario;

public class controleHorario {
	
	public static void main(String[] args) {
		
		
		
		hora horaChegada = new hora(8, 0, 1);
        hora horaSaida = new hora(9, 30, 0);
        funcionario geddyLee = new funcionario("Geddy Lee", horaChegada, horaSaida);
        
        System.out.println("Hora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.1f\n",geddyLee.getHorasTrabalhadas());
		
	}

}

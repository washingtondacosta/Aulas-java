package sobrecarga;

public class sobrecarga {

	public static int quadrado(int num) {

		return num * num;

	}

	public static double quadrado(double num) {

		return num * num;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Inteiro 2 ao quadrado " + quadrado(2));
		System.out.println("Double Pi ao quadrado " + quadrado(Math.PI));

	}

}

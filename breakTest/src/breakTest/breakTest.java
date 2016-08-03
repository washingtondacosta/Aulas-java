package breakTest;

public class breakTest {

	public static void main(String[] args) {

		long i = System.currentTimeMillis();

		for (int count = 1; count <= 1000000; count++) {

			if (count % 2 == 0) {
				continue;
			}

			if ((count % 17 == 0) && (count % 19 == 0)) {

				System.out.println("O menor núemro divisor de 17 e 19 entre 1 e 1000000 é: " + count);
				break;
			}

		}

		System.out.println("Tempo de execução: " + (System.currentTimeMillis() - i));
	}

}

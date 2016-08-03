
public class NumPrimo {

	public static boolean testePrimo(int num) {

		int z = 0;
		boolean primo = false;
		for (long i = 1; i <= num; i++) {
			if ((num % i) == 0)
				z++;
		}

		if (z == 2) {
			primo = true;
		}

		return primo;

	}

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {

			if (testePrimo(i) == true) {
				System.out.println(i);
			}
		}

	}

}

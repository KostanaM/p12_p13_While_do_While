package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		int i, k, n, suma = 0;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite k");
		k = ulaz.nextInt();
		System.out.println("Unesite n");
		n = ulaz.nextInt();

		i = k;

		while (i <= n) {
			suma += i++;

		}

		System.out.println("Od " + k + " do " + n + " suma " + suma);

		ulaz.close();
	}
}

package kostana.maksic;

import java.util.Scanner;

public class Zadatak11a {

	public static void main(String[] args) {
		int s = 0, n;
		int i = 1;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n:");
		n = ulaz.nextInt();

		do {
			if (i % 2 != 0)
				s += Math.pow(i, 2);
			i++;
		} while (i <= n);

		System.out.println("Suma je: " + s);

		ulaz.close();
	}

}

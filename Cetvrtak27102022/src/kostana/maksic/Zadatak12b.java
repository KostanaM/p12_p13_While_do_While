package kostana.maksic;

import java.util.Scanner;

public class Zadatak12b {

	public static void main(String[] args) {
		double s = 0;
		int n, k;
		int i = 0;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n:");
		n = ulaz.nextInt();
		System.out.println("Unesite k:");
		k = ulaz.nextInt();

		while (i <= n) {

			s = s + 2 / (double) (k + i);
			i++;
		}

		System.out.println("Suma je: " + s);

		ulaz.close();
	}

}

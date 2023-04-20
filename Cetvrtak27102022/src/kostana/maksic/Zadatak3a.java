package kostana.maksic;

import java.util.Scanner;

public class Zadatak3a {

	public static void main(String[] args) {

		double s = 0;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();

		for (int i = 1; i <= n; i++)

			s += 1.0 / i;

		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je:" + s);

		ulaz.close();
	}

}

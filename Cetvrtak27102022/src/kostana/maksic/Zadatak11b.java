package kostana.maksic;

import java.util.Scanner;

public class Zadatak11b {

	public static void main(String[] args) {
		int s = 0;
		int i = 1;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n:");
		int n = ulaz.nextInt();

		while (i <= n) {
			if (i % 2 != 0)
				s += Math.pow(i, 2);
			i++;
		}
		System.out.println("Suma je: " + s);

		ulaz.close();
	}

}

package kostana.maksic;

import java.util.Scanner;

public class Zadatak20b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n:");
		int n = sc.nextInt();

		double s = 0;
		int i = 1;

		do {
			s += 1.0 / Math.pow((3.0 * i), 2);
			i++;
		} while (i <= n);

		System.out.println(s);

		sc.close();
	}

}

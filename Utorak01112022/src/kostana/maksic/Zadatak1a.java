package kostana.maksic;

import java.util.Scanner;

public class Zadatak1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		double s = 0;

		for (int i = 1; i <= n; i++)

			s += i / (i + 1.0);

		System.out.println("Suma je " + s);

		sc.close();
	}

}

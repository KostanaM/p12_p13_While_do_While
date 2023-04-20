package kostana.maksic;

import java.util.Scanner;

public class Zadatak4b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		double n = sc.nextDouble();
		System.out.println("Unesite k");
		double k = sc.nextDouble();
		double s = 0;
		int i = 1;

		do {

			s += (k * i) / Math.pow((2.0 * i - 1.0), 2.0);
			i++;
		} while (i <= n);

		System.out.println(s);
		sc.close();
	}

}

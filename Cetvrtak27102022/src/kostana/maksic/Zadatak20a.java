package kostana.maksic;

import java.util.Scanner;

public class Zadatak20a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n:");
		int n = sc.nextInt();

		double s = 0;
		int i = 1;

		while (i <= n) {
			s += 1.0 / Math.pow((3.0 * i), 2);
			i++;
		}
		System.out.println(s);

		sc.close();
	}

}

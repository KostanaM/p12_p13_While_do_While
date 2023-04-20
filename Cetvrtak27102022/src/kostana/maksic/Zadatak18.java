package kostana.maksic;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		double s = 0;

		int i = 1;

		while (i <= n) {
			s += i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("Suma je " + s);

		sc.close();
	}

}

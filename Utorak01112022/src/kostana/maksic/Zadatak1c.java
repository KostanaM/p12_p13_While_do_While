package kostana.maksic;

import java.util.Scanner;

public class Zadatak1c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		double s = 0;
		int i = 1;

		do {
			s += i / (i + 1.0);
			i++;

		} while (i <= n);

		System.out.println("Suma je " + s);

		sc.close();
	}

}

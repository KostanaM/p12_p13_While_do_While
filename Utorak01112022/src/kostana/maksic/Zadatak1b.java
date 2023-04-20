package kostana.maksic;

import java.util.Scanner;

public class Zadatak1b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		double s = 0;
		int i = 1;

		while (i <= n) {
			s += i / (i + 1.0);
			i++;
		}
		System.out.println("Suma je " + s);

		sc.close();
	}

}

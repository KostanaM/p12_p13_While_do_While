package kostana.maksic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 1, s = 0, i = 0;

		while (i < 10 && b != 0) {
			System.out.println("Unesite vrednost broja");
			int br = sc.nextInt();
			if (br == 0)
				b = 0;
			else if (br % 2 == 0) {
				s += br;
				i++;
			}
		}
		if (b == 1)
			System.out.println("Sumirano je 10 parnih brojeva");
		else
			System.out.println("Korisnik je uneo cifru 0");
		System.out.println("i = " + i + " s = " + s);
		sc.close();
	}
}

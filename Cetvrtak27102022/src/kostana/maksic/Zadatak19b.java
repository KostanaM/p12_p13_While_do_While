package kostana.maksic;

import java.util.Scanner;

public class Zadatak19b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n:");
		int n = sc.nextInt();

		int s = 0;
		int i = 0;

		do {
			if (i % 2 == 0)
				s += i;
			i++;

		} while (i <= n);

		System.out.println(s);

		sc.close();
	}

}
package kostana.maksic;

import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {

		int n;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n");
		n = ulaz.nextInt();

		int i = 1;

		while (i <= n) {
			if (i % 2 != 0)

				// System.out.println(i);
				// s=s+i i operator= +=; *=; /=;
				System.out.println(i);
			i++;
		}

		ulaz.close();

	}
}

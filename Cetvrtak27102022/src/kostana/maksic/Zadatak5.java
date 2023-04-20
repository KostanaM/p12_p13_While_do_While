package kostana.maksic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		int a, n, i = 1;
		System.out.println("Unesite n");
		n = ulaz.nextInt();
		System.out.println("Unesite a");
		a = ulaz.nextInt();

		while (i <= n) {
			if (i % a == 0)
				System.out.println(i);
			i++;
		}
		ulaz.close();
	}
}

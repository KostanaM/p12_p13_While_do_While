package kostana.maksic;

import java.util.Scanner;

public class Zadatak19a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n:");
		int n = sc.nextInt();

		int s = 0;
		int i = 0;

		while (i <= n) {
			if (i % 2 == 0)
				s += i;
			i++;
		}
		System.out.println(s);
		sc.close();
	}

}

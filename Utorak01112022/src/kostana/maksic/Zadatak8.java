package kostana.maksic;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		int i = 1;
		int p = 1;
		int s = 0;
		while (i <= 3 * n) {
			p *= i;
			if (i % 3 == 0)
				s += p;
			i++;
		}
		System.out.println(s);

		sc.close();
	}

}

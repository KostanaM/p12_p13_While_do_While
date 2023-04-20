package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		int n, i = 1;
		double s = 0;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n");
		n = ulaz.nextInt();

		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}
		System.out.println(s);
		ulaz.close();
	}

}

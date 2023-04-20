package kostana.maksic;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		System.out.println("Unesite k");
		int k = sc.nextInt();
		int i = 1;
		double p = 1;
		double s = 0;
		while (i <= n) {
			p *= i;
			s += p / Math.pow(k, i);
			i++;
		}
		System.out.println(s);

		sc.close();
	}

}

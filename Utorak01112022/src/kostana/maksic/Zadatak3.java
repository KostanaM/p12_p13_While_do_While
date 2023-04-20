package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		double n = sc.nextDouble();
		System.out.println("Unesite a");
		double a = sc.nextDouble();
		System.out.println("Unesite e");
		double e = sc.nextDouble();

		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		int i = 0;

		while (Math.abs(x1 - x0) > e) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
			i++;
		}
		System.out.println(x1);
		System.out.println(i);
		sc.close();
	}

}

package kostana.maksic;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		int i = 1;
		double s = 0;
		while (i <= n) {
			s += Math.pow(-1.0, i + 1.0) * i / (i + 1.0);
			i++;
		}
		System.out.println(s);
		sc.close();
	}

}

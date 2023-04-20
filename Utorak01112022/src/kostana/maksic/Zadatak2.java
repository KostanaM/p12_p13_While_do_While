package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int broj = sc.nextInt();

		int cifra;
		do {
			cifra = broj % 10;
			broj = broj / 10;

			System.out.println(cifra);
		} while (broj > 0);

		sc.close();
	}
}

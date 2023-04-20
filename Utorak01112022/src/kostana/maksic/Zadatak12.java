package kostana.maksic;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite a");
		int a = sc.nextInt();
		System.out.println("Unesite b");
		int b = sc.nextInt();
		int i = a;

		while (i <= b) {
			System.out.println(i);
			i *= 4;

		}

		sc.close();
	}

}

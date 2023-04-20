package kostana.maksic;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		int n, i, suma = 0;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n");
		n = ulaz.nextInt();

		i = 1;

		while (i <= n) {
			if (i % 10 == 8) {
				System.out.println(i);
				suma += i;
			}
			i++;
		}
		System.out.println("Suma je " + suma);
		ulaz.close();
	}

}

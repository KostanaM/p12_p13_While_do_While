package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak10a {

	public static void main(String[] args) {
		double s = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n");
		int n = ulaz.nextInt();

		int i = 1;
		while (i <= n) {

			s += 1 / (double) (2 * i);
			i++;
		}
		System.out.println("Suma je: " + df.format(s));
		ulaz.close();
	}

}

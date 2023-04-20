package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak10b {

	public static void main(String[] args) {

		double s = 0;

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite n");
		int n = ulaz.nextInt();
		int i = 1;
		do {
			s += 1.0 / (2.0 * i);
			i++;
		} while (i <= n);

		System.out.println("Suma je: " + df.format(s));

		ulaz.close();
	}

}

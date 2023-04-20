package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak14a {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");

		// Štampanje zaglavlja

		System.out.println("\tX\tF(X)");

		double f, x;
		x = 1.0;

		while (x <= 2.0) {

			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);

			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
			x += 0.2;
		}
	}

}

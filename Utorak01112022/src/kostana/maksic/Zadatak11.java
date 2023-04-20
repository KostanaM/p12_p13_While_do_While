package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak11 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###0.00");
		double x, y;
		System.out.println("\tB.BR." + "\t X" + "\t Y");
		int i = 0;

		for (x = 1.0; x <= 2.0; x += 0.2) {

			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			i++;

			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));

		}

	}

}

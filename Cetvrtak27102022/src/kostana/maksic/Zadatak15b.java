package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak15b {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");

		System.out.println("\tR.BR" + "\t X" + "\t Y");

		double y;
		double x = 1.0;
		int i = 0;

		while (x <= 10.0) {
			y = x - 0.3 * (x * x) / (x + 1.2);
			i++;

			System.out.println("\t" + i + "\t" + x + "\t" + df.format(y));

			x += 0.5;
		}
	}
}

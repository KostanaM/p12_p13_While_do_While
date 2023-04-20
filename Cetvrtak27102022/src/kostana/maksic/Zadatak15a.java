package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak15a {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");

		System.out.println("\tR.BR" + "\t X" + "\t Y");

		double y;
		double x = 1.0;
		int i = 0;

		for (x = 1.0; x <= 10.0; x += 0.5) {

			y = x - 0.3 * (x * x) / (x + 1.2);
			i++;

			System.out.println("\t" + i + "\t" + x + "\t" + df.format(y));

		}
	}
}

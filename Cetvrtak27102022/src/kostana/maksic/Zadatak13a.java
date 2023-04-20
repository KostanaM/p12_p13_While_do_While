package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak13a {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite epsilon");
		double epislon = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite x0");
		double x0 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite y0");
		double y0 = Double.parseDouble(ulaz.readLine());
		double x1 = 0.5 * Math.sqrt(x0 * (3 * y0));
		double y1 = Math.sqrt((x0 + 3) / 2);

		while ((Math.abs(x1 - x0) > epislon) || (Math.abs(y1 - y0) > epislon)) {
			x0 = x1;

			x1 = 0.5 * Math.sqrt(x0 * (3.0 * y0 - 1.0) + 1.0);
			y0 = y1;
			y1 = Math.sqrt((x0 + 3.0) / 2.0);

		}
		System.out.println("Rešenja jednačina su x = " + df.format(x1) + " i y = " + df.format(y1));

	}

}

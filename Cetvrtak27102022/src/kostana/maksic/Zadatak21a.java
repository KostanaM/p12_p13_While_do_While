package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak21a {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###0.00");
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("\tB.BR." + "\t X" + "\t Y");
		int i = 0;
		x = 1.0;

		while (x <= 5.0) {
			y = x - 0.8 * Math.pow(x, 2);

			i++;
			System.out.println("\t" + i + "\t" + x + "\t" + df.format(y));
			x += 0.5;
		}

		sc.close();
	}

}

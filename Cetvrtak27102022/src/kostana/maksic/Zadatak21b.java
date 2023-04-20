package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak21b {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###0.00");

		Scanner sc = new Scanner(System.in);
		sc.close();
		double x, y;

		System.out.println("\tB.BR." + "\t X" + "\t Y");

		int i = 0;

		for (x = 1.0; x <= 5.0; x += 0.5) {
			y = x - 0.8 * Math.pow(x, 2);
			i++;
			System.out.println("\t" + i + "\t" + x + "\t" + df.format(y));
		}

	}
}

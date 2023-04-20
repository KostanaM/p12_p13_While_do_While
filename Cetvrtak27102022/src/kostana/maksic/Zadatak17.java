package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double s = 0;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = ulaz.nextInt();

		System.out.println("Unesite k:");
		int k = ulaz.nextInt();

		int i = 0;

		while (i <= n) {
			s += (double) (1 + i) / (double) (k + i);
			i++;
		}
		System.out.println("Suma je " + df.format(s));
		ulaz.close();
	}
}

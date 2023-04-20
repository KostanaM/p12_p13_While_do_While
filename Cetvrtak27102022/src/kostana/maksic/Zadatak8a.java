package kostana.maksic;

public class Zadatak8a {
	public static void main(String[] args) {
		double X0 = 18.0;
		double X1 = 30.0 / (X0 * X0) - 42.0 / X0 + 18.0;

		while (Math.abs(X1 - X0) > 1.0E-5) {
			X0 = X1;
			X1 = 30.0 / (X0 * X0) - 42.0 / X0 + 18.0;
		}
		System.out.println("Dobijena vrijednost je X = " + X1);

	}
}

package kostana.maksic;

public class Zadatak8b {
	public static void main(String[] args) {
		boolean provera = true;
		double X0 = 18.0;
		double X1 = 0.0;

		while (provera) {
			X1 = 30.0 / (X0 * X0) - 42.0 / X0 + 18.0;
			provera = Math.abs(X1 - X0) > 1.0E-5;
			X0 = X1;
		}
		System.out.println("Dobijena vrijednost je X = " + X1);

	}
}

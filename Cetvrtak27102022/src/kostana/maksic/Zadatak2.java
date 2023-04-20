package kostana.maksic;

public class Zadatak2 {

	public static void main(String[] args) {
		int i = 0;
		// while (++i < 5) - izvršiće se 4 puta jer je ++ prefiks; uvecaj pa poredi
		// while (i++ < 5) - izvršiće se 5 puta jer je ++ sufiks; poredi pa uvecaj
		while (i++ < 5) {
			System.out.println(i);
		}

	}

}

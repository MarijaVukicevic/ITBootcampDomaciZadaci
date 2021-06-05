package pauzaDomaci;

public class ZamenaVrednosti2 {
/*Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene.
Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih*/
	
	public static void main(String[] args) {

		int x = 3;
		int y = 7;

		System.out.println("x = " + zameniPrvi(x, y) + "\n" + "y = " + zameniDrugi(x, y));

	}

	public static int zameniPrvi(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return a;

	}

	public static int zameniDrugi(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return b;

	}
}

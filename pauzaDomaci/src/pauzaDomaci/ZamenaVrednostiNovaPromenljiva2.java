package pauzaDomaci;

public class ZamenaVrednostiNovaPromenljiva2 {
/*Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene.
Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih*/
	
	public static void main(String[] args) {

		int x = 3;
		int y = 7;

		int novoX = zameniPrvi(x, y);
		int novoY = zameniDrugi(x, y);

		System.out.println("x = " + novoX + "\n" + "y = " + novoY);
		
	}

	public static int zameniPrvi(int a, int b) {
		int pom = a;
		a = b;
		b = pom;
		return a;
	}

	public static int zameniDrugi(int a, int b) {
		int pom = a;
		a = b;
		b = pom;
		return b;

	}
}
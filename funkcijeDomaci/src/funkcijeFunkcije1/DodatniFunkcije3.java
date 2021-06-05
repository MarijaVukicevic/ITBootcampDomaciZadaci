package funkcijeFunkcije1;

import java.util.Scanner;

public class DodatniFunkcije3 {

	public static int saberi(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		/*
		 * spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program
		 * koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve
		 * metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih
		 * brojeva.
		 */

		Scanner sc = new Scanner(System.in);

		int br1, br2, br3;

		System.out.print("Unesite prvi broj: ");
		br1 = sc.nextInt();

		System.out.print("Unesite drugi broj: ");
		br2 = sc.nextInt();

		System.out.print("Unesite treci broj: ");
		br3 = sc.nextInt();

		int zbir = saberi(br1, br2, br3);
		System.out.println("Zbir unetih brojeva: " + zbir);

		int najveciBroj = max(br1, br2, br3);

		System.out.println("Najveci broj je: " + najveciBroj);

	}

}

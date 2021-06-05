package funkcijeFunkcije1;

import java.util.Scanner;

public class Funkcije1 {

	public static int min(int a, int b, int c) {

		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci
		 * da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu)
		 * najmanji od ta tri unesena broja.
		 */

		Scanner sc = new Scanner(System.in);

		int br1, br2, br3;
		
		System.out.print("Unesite prvi broj: ");
		br1 = sc.nextInt();

		System.out.print("Unesite drugi broj: ");
		br2 = sc.nextInt();

		System.out.print("Unesite treci broj: ");
		br3 = sc.nextInt();

		int najmanjiBroj = min(br1, br2, br3);

		System.out.println("Najmanji broj je: " + najmanjiBroj);

	}

}

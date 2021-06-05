package nizoviNizovi1;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 84
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza:");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		unosElemenata(niz);

		proizvodBrojevaVecihOdIndeksa(niz);

	}

	public static void unosElemenata(int[] a) {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Unesite " + i + ". element:");
			a[i] = s.nextInt();

			while (a[i] < 1) {
				System.out.println("Vrednost nije validna, unesite ponovo:");
				a[i] = s.nextInt();
			}
		}
	}

	public static void proizvodBrojevaVecihOdIndeksa(int[] a) {
		int proizvod = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				proizvod = proizvod * a[i];
			}
		}
		System.out.println("Proizvod elemenata koji su veci od svog indeksa " + proizvod);
	}

}

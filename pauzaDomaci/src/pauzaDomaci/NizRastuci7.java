package pauzaDomaci;

import java.util.Scanner;

public class NizRastuci7 {
//Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
//Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci.
//Primer2 niza: 71 422 1001 5054 Ispis: Niz je rastuci.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza: ");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		unosElemenata(niz);

		boolean rezultatProvere = rasteIliNe(niz);
		if (rezultatProvere) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci.");
		}

	}

	public static void unosElemenata(int[] a) {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Unesite " + (i + 1) + ". element: ");
			a[i] = s.nextInt();
		}

	}

	public static boolean rasteIliNe(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {
					return false;
				}
			}
		}
		return true;
	}
}

package nizoviNizovi1;

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji sa standardnog ulaza ucitava duzinu i elemente niza
		 * koji su tipa int. Zatim niz proslediti metodi koja treba da proveri da li je
		 * niz palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika
		 * njemu razumljivim tekstom da li je unesen niz palindrom. Primer ucitanog niza
		 * koji je palindrom: 12 46 17 46 12 Primer ucitanog niza koji nije palindrom:
		 * 12 46 17 12 64
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza:");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		proveraPalindrom(niz);

	}

	public static void proveraPalindrom(int[] a) {
		Scanner s = new Scanner(System.in);
		int provera = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza.");
			a[i] = s.nextInt();

			if (a[i] == a[a.length - 1 - i]) {
				provera++;
			} else {
				provera--;
			}

		}

		if (provera >= 0) {
			System.out.println("Niz je palindrom.");
		} else {
			System.out.println("Niz nije palindrom.");
		}

	}

}
package pauzaDomaci;

import java.util.Scanner;

public class MaxMin5 {
//Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza: ");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		unosElemenata(niz);

		System.out.println("Najveci broj je: " + maks(niz));
		System.out.println("Najmanji broj je: " + min(niz));

	}

	public static void unosElemenata(int[] a) {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Unesite " + (i + 1) + ". element: ");
			a[i] = s.nextInt();
		}

	}

	public static int maks(int[] a) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}

		return max;
	}

	public static int min(int[] a) {
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}

		return min;
	}

}

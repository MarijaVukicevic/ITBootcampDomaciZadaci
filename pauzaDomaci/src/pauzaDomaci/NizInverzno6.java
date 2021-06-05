package pauzaDomaci;

import java.util.Scanner;

public class NizInverzno6 {
	/*
	 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
	 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza: ");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		unosElemenata(niz);
		invRed(niz);

	}

	public static void unosElemenata(int[] a) {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Unesite " + (i + 1) + ". element: ");
			a[i] = s.nextInt();
		}

	}

	public static void invRed(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[a.length - 1 - i] + " ");
			
		}
	}
}
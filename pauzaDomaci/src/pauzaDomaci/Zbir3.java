package pauzaDomaci;

import java.util.Scanner;

public class Zbir3 {
//Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		int n = sc.nextInt();

		System.out.println("Unesite delilac koji ce biti izostavljen: ");
		int k = sc.nextInt();

		int zbir = 0;
		int iterator = 1;

		int zbirN = funkcija(iterator, n, k, zbir);

		System.out.println("Zbir brojeva do broja " + n + ", koji nisu deljivi brojem " + k + ", je : " + zbirN);

	}

	public static int funkcija(int i, int n, int k, int zbir) {
		for (i = 1; i <= n; i++) {
			if (i % k == 0) {
				continue;
			}
			zbir = zbir + i;

		}
		return zbir;
	}

}

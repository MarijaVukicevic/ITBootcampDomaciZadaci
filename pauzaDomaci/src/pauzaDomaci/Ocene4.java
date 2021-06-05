package pauzaDomaci;

import java.util.Scanner;

public class Ocene4 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerickom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 */

		Scanner sc = new Scanner(System.in);

		double[] ocene = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite " + (i + 1) + ". ocenu :");
			ocene[i] = sc.nextInt();

			while (ocene[i] < 1 || ocene[i] > 5) {
				System.out.println("Vrednost nije validna, unesite ponovo:");
				ocene[i] = sc.nextInt();
			}

		}

		System.out.println("Prosek: " + srednjaVrednost(ocene));

	}

	public static double srednjaVrednost(double[] a) {
		double prosek = 0;
		for (int i = 0; i < 3; i++) {
			prosek = (a[0] + a[1] + a[2]) / 3;

		}
		if (prosek >= 4.5 && prosek <= 5) {
			System.out.println("Odlican.");
		} else if (prosek >= 3.5 && prosek < 4.5) {
			System.out.println("Vrlo dobar");
		} else if (prosek >= 2.5 && prosek < 3.5) {
			System.out.println("Dobar.");
		} else if (prosek >= 1.5 && prosek < 2.5) {
			System.out.println("Dovoljan.");
		} else {
			System.out.println("Nedovoljan.");
		}
		return prosek;
	}
}
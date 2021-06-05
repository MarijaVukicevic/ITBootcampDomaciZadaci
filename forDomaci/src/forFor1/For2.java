package forFor1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih
		 * brojeva do n na sledeci nacin: 1) u zbir nece ulaziti brojevi deljivi brojem
		 * 5 2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir
		 * brojeva do tog trenutka.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();

		int zbir = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 5 != 0) {
				zbir = zbir + i;
			}

			if (i == 13) {
				break;
			}

			System.out.println("Zbir je: " + zbir);

		}

	}

}

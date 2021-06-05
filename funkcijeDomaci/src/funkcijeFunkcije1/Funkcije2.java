package funkcijeFunkcije1;

import java.util.Scanner;

public class Funkcije2 {

	public static int pomnozi(int a, int b, int c) {
		int d = a * b * c;
		return d;
	}

	public static void main(String[] args) {
		// Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj
		// program treba da pozove i vrati (u mainu) proizvod unetih brojeva.

		Scanner sc = new Scanner(System.in);

		int br1, br2, br3;

		System.out.print("Unesite prvi broj: ");
		br1 = sc.nextInt();

		System.out.print("Unesite drugi broj: ");
		br2 = sc.nextInt();

		System.out.print("Unesite treci broj: ");
		br3 = sc.nextInt();

		int proizvod = pomnozi(br1, br2, br3);
		System.out.print("Proizvod unetih brojeva: " + proizvod);

	}

}

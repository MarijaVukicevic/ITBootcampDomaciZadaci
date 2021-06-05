package pauzaDomaci;

import java.util.Scanner;

public class Cifre1 {
// Napisati program koji ispisuje koliko cifara ima uneti broj n.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int broj = sc.nextInt();

		int brojac = 0;

		System.out.println("Uneti broj ima " + cifre(broj, brojac) + " cifre/cifara.");
	}

	public static int cifre(int broj, int i) {

		while (broj > 0) {
			broj = broj / 10;
			i++;
		}
		return i;
	}
}
package GrananjaGrananja1;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		/*
		 * Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci grananja kako
		 * bismo se ogradili od nemogucih izracunavanja povrsina (kakvi celi brojevi
		 * moraju da budu visina, sirina i duzina?)
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi duzinu: ");

		int duzina = sc.nextInt();

		System.out.print("Unesi sirinu: ");

		int sirina = sc.nextInt();

		System.out.print("Unesi visinu: ");

		int visina = sc.nextInt();

		int ukupnaPovrsina = 2 * (duzina * sirina + duzina * visina + sirina * visina);

		int povrsinaPoda = duzina * sirina;

		int okrecenaPovrsina = ukupnaPovrsina - povrsinaPoda;

		if (duzina <= 0 || sirina <= 0 || visina <= 0) {
			System.out.println("Nemoguce izracunavanje povrsine.");
		}

		else {
			System.out.println("Povrsina okrecene prostorije: " + okrecenaPovrsina);
		}

	}

}

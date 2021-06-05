package DoWhileDoWhile1;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan broj koji je uneo palindrom ili nije palindrom.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Upisati broj: ");
		int broj = sc.nextInt();

		int broj2 = 0;

		while (broj >= 1) {
			broj2 = broj % 10;
			System.out.print(broj2);
			broj = broj / 10;
		}
		
		if (broj==broj2) {
			System.out.println("Izabrani broj je palindrom.");
		} else {
			System.out.println("Izabrani broj nije palindrom.");
		}
	}	
}


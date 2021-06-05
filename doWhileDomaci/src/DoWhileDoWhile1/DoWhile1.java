package DoWhileDoWhile1;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/* Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze. On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca treba da kupi BUSPLUS kartu
		 *  i vrati se kuci sa novogodisnjim poklonima. Pera treba  da unosi pojedinacne cene poklona, a program treba da ga obavesti kada potrosi sav predvidjeni novac,
		 *   to jest kada za sledeci poklon vise nema kinte.*/

		Scanner sc = new Scanner(System.in);

		System.out.print("Novac na raspolaganju: ");
		int novac = sc.nextInt();

		int potrosenNovac = 0;
		int brojPoklona = 0;

		do {
			System.out.println("Cena poklona: ");
			int cenaPoklona = sc.nextInt();
			novac = novac - cenaPoklona;
			brojPoklona = brojPoklona + 1;
			System.out.println("Broj kupljenih poklona: "+brojPoklona+".");
			

			if (novac == 89) {
				System.out.println("Podsetnik: Ostalo Vam je tacno 89 dinara, potrebnih za kupovinu BUSPLUS karte.");
			}
			if (novac < 89) {
				int prekoracenje = novac - 89;
				System.out.println("Prekoracili ste limit za " + prekoracenje + " dinara.");
			}

		} while (novac >= 89);

		System.out.println("Zavrsili ste kupovinu.");

	}

}
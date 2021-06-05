package pauzaDomaci;

import java.util.Scanner;

public class IspravljenoVezbanje1 {

	public static void main(String[] args) {
/* Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna
Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.*/

		Scanner sc = new Scanner(System.in);

		String meni = "Meni: \n0. Kraj programa. \n1. Dodavanje u korpu. \n2. Placanje.";

		int cena = 0;
		int racun = 0;
		int isprazniti;
		int sredstva = 0;
		int kusur = 0;

		while (true) {
			System.out.println(meni);
			System.out.print("Odaberite opciju:");
			int opcija = sc.nextInt();

			switch (opcija) {

			case 1:
				System.out.print("Unesite broj artikala koje zelite ubaciti u korpu:");
				int n = sc.nextInt();
				while (n < 1) {
					System.out.println("Pogresan podatak, pokusajte ponovo:");
					n = sc.nextInt();
				}
				for (int i = 1; i <= n; i++) {
					System.out.println("Unesite cenu " + i + " proizvoda:");
					cena = sc.nextInt();
					while (cena < 1) {
						System.out.println("Pogresan podatak, pokusajte ponovo:");
						cena = sc.nextInt();
					}
					racun = racun + cena;
					System.out.println("Vase racun iznosi :" + racun + " dinara.");
				}
				System.out.println("Zelite li da ispraznite korpu?\n1. Da \n2. Ne");
				System.out.println("Odaberite opciju:");
				isprazniti = sc.nextInt();
				switch (isprazniti) {
				case 1:
					racun = 0;
					System.out.println("Korpa je ispraznjena. Racun iznosi " + racun + " dinara.");
					break;
				case 2:
					break;
				default:
					System.out.println("Mozete odgovoriti samo sa 'da' ili 'ne'.");
					break;
				}
				break;

			case 2:
				System.out.print("Unesite novac kojim zelite da platite racun:");
				sredstva = sc.nextInt();
				if (racun == 0) {
					System.out.println("Nemate nijedan artikal u korpi.");
					break;
				}
				if (racun > sredstva) {
					System.out.println("Nemate dovoljno sredstava da biste platili racun. Racun iznosi " + racun + ".");
					break;
				}
				if (racun <= sredstva) {
					System.out.println("Racun je izmiren.");
					kusur = sredstva - racun;
					System.out.println("Vas kusur iznosi: " + kusur + " dinara.");
					racun = 0;
					sredstva = 0;
					break;
				}
			case 0:
				if (racun != 0) {
					System.out.println("Program se ne moze zavrsiti dok ne platite racun.");
					break;
				} else if (sredstva != 0) {
					System.out.println("Program se ne moze zavrsiti, niste iskoristili uneta sredstva.");
					break;
				} else {
					System.out.println("Kasa se gasi. Izlazak iz programa.");
					return;
				}
			default:
				System.out.println("Nepostojeca opcija.");
				break;
			}

		}

	}

}

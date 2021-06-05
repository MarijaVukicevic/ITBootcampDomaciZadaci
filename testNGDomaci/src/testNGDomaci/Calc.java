package testNGDomaci;

import java.util.Scanner;

public class Calc {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String figura;
		
		double br1 = 0, br2 = 0;
		String kraj = "izadji";

		while (true) {
			System.out.println("Koristite kalkulator za izracunavanje povrsina geometrijskih figura kvadrat, pravougaonik i krug. Unesite ime figure: ");
			figura = sc.nextLine();
			if (figura.equals(kraj)) {
				break;
			}
			else if (figura.equalsIgnoreCase("kvadrat")) {
				racunajKvadrat(br1);
			}
			else if (figura.equalsIgnoreCase("pravougaonik")) { 
				racunajPravougaonik(br1, br2);
			}
			else if (figura.equalsIgnoreCase("krug")) {
				racunajKrug(br1);
			}
			else {
				System.out.println("Los unos!");
			}
		}
	}	

	public static void racunajKvadrat(double a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata: ");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina {{kvadrata}} je {{" + pKvadrata(a) + "}}");
	}
	
	public static double pKvadrata(double a) {
		return a * a;
	}
	
	public static void racunajPravougaonik(double a, double b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu pravougaonika: ");
		a = sc.nextDouble();
		System.out.println("Unesite sirinu pravougaonika: ");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina {{pravougaonika}} je {{" + pPravougaonika(a, b) + "}}");
	}
	
	public static double pPravougaonika(double a, double b) {
		return a * b;
	}
	
	public static void racunajKrug(double r) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poluprecnik kruga: ");
		r = sc.nextDouble();

		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina {{kruga}} je {{" + pKruga(r) + "}}");
	}	

	public static double pKruga(double r) {
		return r * r * 3.14;
	}
}

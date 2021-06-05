package klase2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase firma.
		Ispisati prezimena svih zaposlenih u firmi.
		Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
		Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
		note: Za oba zadatka kreirati StringBuilder radi vezbe ispisa. U slucaju da se ne snadjete u drugom zadatku, sb nije obavezan.*/
		
		StringBuilder sb = new StringBuilder();
		
		Zaposleni z1 = new Zaposleni("Ivana", "Ivanovic", "Generalni direktor", 2500);
		Zaposleni z2 = new Zaposleni("Petar", "Petrovic", "Zamenik generalnog direktora", 2000);
		Zaposleni z3 = new Zaposleni("Mika", "Mikic", "Menadzer za odnose sa javnoscu", 1500);
		Zaposleni z4 = new Zaposleni("Zika", "Zikic", "Asistent menadzera", 1000);
		
		
		Zaposleni [] zaposleni = {z1, z2, z3, z4};
				
		Firma f1 = new Firma("Abc doo", "Beograd", 123456, zaposleni);
		
		System.out.println("Broj zaposlenih u firmi " + f1.getNaziv() + ": " + zaposleni.length);
		String s = Arrays.toString(zaposleni);
		System.out.println("Zaposleni su: " + s);
		
		System.out.println("Prezimena zaposlenih: ");
		
		for (int i = 0; i < zaposleni.length; i++) {
			System.out.println((zaposleni[i]).getPrezime());
		}
		
		
		
		
								
		}
		
		
		
		
			
	}



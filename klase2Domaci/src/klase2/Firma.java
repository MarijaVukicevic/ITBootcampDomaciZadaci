package klase2;

public class Firma {
/*Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase firma.
Ispisati prezimena svih zaposlenih u firmi.
Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
note: Za oba zadatka kreirati StringBuilder radi vezbe ispisa. U slucaju da se ne snadjete u drugom zadatku, sb nije obavezan.*/
	
	private String naziv;
	private String sediste;
	private int pib;
	private Zaposleni [] zaposleni;
	
	public Firma(String naziv, String sediste, int pib, Zaposleni[] zaposleni) {
		this.naziv = naziv;
		this.sediste = sediste;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getPib() {
		return pib;
	}

	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}
	
	@Override
	public String toString() {
		return "Firma nazivFirme=" + naziv + ", sedisteFirme=" + sediste + ", pib=" + pib + ", zaposleni="
				+ zaposleni + "";
	}



}

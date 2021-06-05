package klase2;

public class Zaposleni {
	/*Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase firma.
	Ispisati prezimena svih zaposlenih u firmi.
	Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
	Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
	note: Za oba zadatka kreirati StringBuilder radi vezbe ispisa. U slucaju da se ne snadjete u drugom zadatku, sb nije obavezan.*/
	
	private String ime;
	private String prezime;
	private String pozicija;
	private double mesecnaPrimanja;
		
	public Zaposleni(String ime, String prezime, String pozicija, double mesecnaPrimanja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.mesecnaPrimanja = mesecnaPrimanja;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public String getPozicija() {
		return pozicija;
	}
	public double getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}
	public void setMesecnaPrimanja(int mesecnaPrimanja) {
		this.mesecnaPrimanja = mesecnaPrimanja;
	}
	
	@Override
	public String toString() {
		return ime.toUpperCase() + "_"+prezime.toUpperCase() + ": "+ pozicija.toUpperCase() + " (" + mesecnaPrimanja+ ")";
	}
	
}

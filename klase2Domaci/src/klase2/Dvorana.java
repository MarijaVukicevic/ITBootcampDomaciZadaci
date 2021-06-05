package klase2;

public class Dvorana {
//Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se dogadjaj organizuje i tip (koncert, utakmica, vencanje…)
//Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).
//Uvezati ove klase i u glavnom programu se igrati sa njima.
	
	private String naziv;
	private String grad;
	private int kapacitet;
	
	
	public Dvorana(String naziv, String grad, int kapacitet) {
		this.naziv = naziv;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getGrad() {
		return grad;
	}


	public int getKapacitet() {
		return kapacitet;
	}


	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	
	
	
}
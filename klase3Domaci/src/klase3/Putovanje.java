package klase3;

import java.util.List;

public class Putovanje {
//Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. Putnici imaju ime, prezime i broj pasosa.
//U glavnom programu se igrati i testirati napisane klase.
//Obavezni deo: napraviti bar 3 razlicita putovanja.
//Po zelji staviti putovanja u listu koja se zove ponuda.
//Jednom putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
//Sa putovanja izbaciti jednog od putnika.
//Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
	
	private String destinacija;
	private double cenaAranzmana;
	private List <Putnici> listaPutnika;
	
	public Putovanje(String destinacija, double cenaAranzmana, List<Putnici> listaPutnika) {
		super();
		this.destinacija = destinacija;
		this.cenaAranzmana = cenaAranzmana;
		this.listaPutnika = listaPutnika;
	}

	
	
	public Putovanje(String destinacija, double cenaAranzmana) {
		super();
		this.destinacija = destinacija;
		this.cenaAranzmana = cenaAranzmana;
	}



	public double getCenaAranzmana() {
		return cenaAranzmana;
	}

	public void setCenaAranzmana(double cenaAranzmana) {
		this.cenaAranzmana = cenaAranzmana;
	}

	public List<Putnici> getListaPutnika() {
		return listaPutnika;
	}

	public void setListaPutnika(List<Putnici> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}

	public String getDestinacija() {
		return destinacija;
	}
	
	
	
	

}

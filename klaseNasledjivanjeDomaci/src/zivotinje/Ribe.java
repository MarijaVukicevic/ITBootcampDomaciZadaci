package zivotinje;

public class Ribe extends Kicmenjaci {
//Zivotinje
//U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, potklasa... Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje...), konkretan naziv i omiljenu hranu.

//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
//Ispisati bar jedno staniste.
//Jednom sisaru zameniti boju dlake.
	
	private String vrstaVode;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String naziv, String omiljenaHrana, String vrstaVode, String vrstaPeraja) {
		super(vrsta, naziv, omiljenaHrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}
	public String getVrstaVode() {
		return vrstaVode;
	}
	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}
	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vrsta");
		sb.append(" ");
		sb.append("zivotinja");
		sb.append(" ");
		sb.append("kojoj");
		sb.append(" ");
		sb.append("pripada");
		sb.append(" ");
		sb.append(naziv.toLowerCase());
		sb.append(":");
		sb.append(" ");
		sb.append(vrsta.toLowerCase());
		return sb.toString();
	}
	
	
	

}

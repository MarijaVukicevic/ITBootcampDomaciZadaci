package zivotinje;

public class Sisari extends Kicmenjaci {
//Zivotinje
//U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, potklasa... Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje...), konkretan naziv i omiljenu hranu.

//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
//Ispisati bar jedno staniste.
//Jednom sisaru zameniti boju dlake.
	
	private String bojaDlake;
	private int brojNogu;
	
	public Sisari(String vrsta, String naziv, String omiljenaHrana, String bojaDlake, int brojNogu) {
		super(vrsta, naziv, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public int getBrojNogu() {
		return brojNogu;
	}
	
	public String promenaDlake() {
		StringBuilder sb = new StringBuilder();
		sb.append("Boja");
		sb.append(" ");
		sb.append("dlake");
		sb.append(" ");
		sb.append("zivotinje");
		sb.append(" ");
		sb.append(naziv.toLowerCase());
		sb.append(" ");
		sb.append(":");
		sb.append(" ");
		sb.append(bojaDlake.toLowerCase());
		return sb.toString();
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

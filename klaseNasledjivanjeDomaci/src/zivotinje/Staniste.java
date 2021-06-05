package zivotinje;

import java.util.List;

public class Staniste {
//Zivotinje
//U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, potklasa... Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje...), konkretan naziv i omiljenu hranu.

//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
//Ispisati bar jedno staniste.
//Jednom sisaru zameniti boju dlake.

	List<Zivotinje> listaZivotinja;
	private String nazivStanista;

	public Staniste(List<Zivotinje> listaZivotinja, String nazivStanista) {
		super();
		this.listaZivotinja = listaZivotinja;
		this.nazivStanista = nazivStanista;
	}

	public List<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public void setListaZivotinja(List<Zivotinje> listaZivotinja) {
		this.listaZivotinja = listaZivotinja;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaZivotinja.size(); i++) {

			sb.append("Staniste");
			sb.append(" ");
			sb.append("zivotinje");
			sb.append(" ");
			sb.append(listaZivotinja.get(i).getNaziv().toLowerCase());
			sb.append(":");
			sb.append(" ");
			sb.append(nazivStanista.toLowerCase());
			sb.append("\n");
			
		}
		return sb.toString();

	}
}

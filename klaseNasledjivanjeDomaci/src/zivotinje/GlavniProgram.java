package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
//Zivotinje
//U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, potklasa... Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje...), konkretan naziv i omiljenu hranu.

//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
//Ispisati bar jedno staniste.
//Jednom sisaru zameniti boju dlake.
		
		Zivotinje z1 = new Zivotinje("Kicmenjak", "Panda", "Bambus");
		Zivotinje z2 = new Zivotinje("Kicmenjak", "Som", "Manje ribe");

		Sisari s1 = new Sisari("Kicmenjak", "Lav", "Meso", "Braon", 4);
		Sisari s2 = new Sisari("Kicmenjak", "Simpanza", "Voce", "Crna", 2);

		Ribe r1 = new Ribe("Kicmenjak", "Saran", "Insekti", "Slatka voda", "Grudna, trbusna, podrepno, repno i ledjno");
		Ribe r2 = new Ribe("Kicmenjak", "Smudj", "Manje ribe", "Slatka voda", "Ledjna, prednje i zadnje");

		System.out.println(s2.toString());
		
		System.out.println(r1.toString());

		List<Zivotinje> stanisteKop = new ArrayList<Zivotinje>();
		stanisteKop.add(s1);
		stanisteKop.add(s2);
		stanisteKop.add(z1);

		Staniste st1 = new Staniste(stanisteKop, "Kopneno staniste");

		System.out.print(st1.toString());

		List<Zivotinje> stanisteVod = new ArrayList<Zivotinje>();
		stanisteVod.add(r1);
		stanisteVod.add(r2);
		stanisteVod.add(z2);

		Staniste st2 = new Staniste(stanisteVod, "Vodeno staniste");

		System.out.print(st2.toString());

		if (stanisteKop.get(0) instanceof Sisari) {
			Sisari ss = (Sisari) stanisteKop.get(0);
			ss.setBojaDlake("Zuta");
			System.out.println(ss.promenaDlake());
		}
		
	}

}

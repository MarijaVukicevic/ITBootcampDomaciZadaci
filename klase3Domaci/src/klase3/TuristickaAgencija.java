package klase3;

import java.util.ArrayList;
import java.util.List;

public class TuristickaAgencija {

	public static void main(String[] args) {
		//Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. Putnici imaju ime, prezime i broj pasosa.
		//U glavnom programu se igrati i testirati napisane klase.
		//Obavezni deo: napraviti bar 3 razlicita putovanja.
		//Po zelji staviti putovanja u listu koja se zove ponuda.
		//Jednom putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
		//Sa putovanja izbaciti jednog od putnika.
		//Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
		
		
		Putnici putnik1 = new Putnici("Petar", "Petrovic", 111222);
		Putnici putnik2 = new Putnici("Jovan", "Jovanovic", 222333);
		Putnici putnik3 = new Putnici("Ivana", "Ivanovic", 444555);
		Putnici putnik4 = new Putnici("Filip", "Filipovic", 555666);
		Putnici putnik5 = new Putnici("Mika", "Mikic", 777888);
		Putnici putnik6 = new Putnici("Pera", "Peric", 888999);
		Putnici putnik7 = new Putnici("Sara", "Saric", 999000);
				
		List <Putnici> listaPutnika1 = new ArrayList <Putnici>();
		listaPutnika1.add(putnik1);
		listaPutnika1.add(putnik2);
		
		List <Putnici> listaPutnika2 = new ArrayList <Putnici>();
		listaPutnika2.add(putnik3);
		listaPutnika2.add(putnik4);
		listaPutnika2.add(putnik5);
		
		List <Putnici> listaPutnika3 = new ArrayList <Putnici>();
		listaPutnika3.add(putnik1);
		listaPutnika3.add(putnik6);
		listaPutnika3.add(putnik7);
	
	    Putovanje put1 = new Putovanje("Meksiko", 1290, listaPutnika1);
	    Putovanje put2 = new Putovanje("Egipat", 470, listaPutnika2);
	    Putovanje put3 = new Putovanje("Maldivi", 1100, listaPutnika3);
	    
	    List <Putovanje> ponuda = new ArrayList <Putovanje>();
	    ponuda.add(put1);
	    ponuda.add(put2);
	    ponuda.add(put3);
	    
	    System.out.println(ponuda.get(0).getDestinacija() + ", cena: "  + ponuda.get(0).getCenaAranzmana());
	    ponuda.get(0).setCenaAranzmana(1150);
	    System.out.println(ponuda.get(0).getDestinacija() + ", cena sa popustom: " + ponuda.get(0).getCenaAranzmana());
	    
	    System.out.println("Broj putovanja u ponudi: " + ponuda.size());
	    ponuda.remove(2);
	    System.out.println("Zbog nedovoljne zainteresovanosti, destinacija " + put2.getDestinacija() + " vise nije u ponudi. Trenutno je u ponudi " + ponuda.size() + " putovanja.");
	    
	    
	    System.out.println(listaPutnika3.size());
	    System.out.println("Putnik sa brojem pasosa " + listaPutnika3.get(0).getBrojPasosa() + ", " + listaPutnika3.get(0).getIme() + " " + listaPutnika3.get(0).getPrezime() + ", odustaje od putovanja.");
	    listaPutnika3.remove(0);
	    System.out.println(listaPutnika3.size());
	
	}

}

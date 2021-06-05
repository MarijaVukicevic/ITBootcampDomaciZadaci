package bankaDom;

public class BankaKod {
//Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti klasu TestBankaKod i:
//proveriti da li konstruktor dobro postavlja argumente,
//kao i da li get metode vracaju odgovarajuce vrednosti.
//Kada se napravi racun, na stanju je 0 dinara.


	   private String ziroRacun;
	   private String ime;
	   private Double iznos;
	  
	   public BankaKod(String ime, String ziroRacun){
	       this.ziroRacun=ziroRacun;
	       this.ime = ime; //umesto "ime"
	       this.iznos=0d;
	   }

	   public String dohvatiZiroRacun() {
	       return ziroRacun;
	   }
	   public String dohvatiIme() {
	       return ime;
	   }
	   public Double dohvatiIznos() {
	       return iznos;
	   }


}

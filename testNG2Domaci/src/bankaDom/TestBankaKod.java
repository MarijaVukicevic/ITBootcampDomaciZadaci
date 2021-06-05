package bankaDom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {
//Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti klasu TestBankaKod i:
//proveriti da li konstruktor dobro postavlja argumente,
//kao i da li get metode vracaju odgovarajuce vrednosti.
//Kada se napravi racun, na stanju je 0 dinara.
	
	@Test
	public void testKonstruktor() {
		
		BankaKod bk = new BankaKod("Marija", "123-456-789");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), "Marija");
		sa.assertEquals(bk.dohvatiZiroRacun(), "123-456-789");
		sa.assertEquals(bk.dohvatiIznos(), 0d);
		
		sa.assertAll();
	}
	
	@Test
	public void testDohvati() {
		
		String ime = "Marija";
		String ziroRacun = "123-456-789";
		double stanje = 0;
		
		BankaKod bk = new BankaKod(ime, ziroRacun);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), ime);
		sa.assertEquals(bk.dohvatiZiroRacun(), ziroRacun);
		sa.assertEquals(bk.dohvatiIznos(), stanje);
						
		sa.assertAll();
		
	}

}

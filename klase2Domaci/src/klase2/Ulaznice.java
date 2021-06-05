package klase2;

public class Ulaznice {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		Dvorana d1 = new Dvorana("Kombank Dvorana", "Beograd", 1300);
		Dvorana d2 = new Dvorana("Stark Arena", "Beograd", 19000);
		Dvorana d3 = new Dvorana("Spens", "Novi Sad", 11500);

		Event e1 = new Event("15. maj, 20:30", d2, "Koncert: Nick Cave and The Bad Seeds");
		Event e2 = new Event("28. maj, 18:30", d1, "Koncert: Queen Real Tribute");
		Event e3 = new Event("29. maj, 21:00", d3, "Utakmica: KK Vojvodina - KK Crvena Zvezda");
		Event e4 = new Event("5. jun, 20:45", d2, "Utakmica: Srbija - Litvanija");

		System.out.println("Predstojeca kulturna desavanja, grad " + d1.getGrad() + ":");
		System.out.println(e1.getTipDogadjaja().toUpperCase() + "\n" + "Vreme odrzavanja: " + e1.getVreme());
		System.out.println("Lokacija: " + e1.getDvorana().getNaziv() + ", " + e1.getDvorana().getGrad());
		System.out.println("Kapacitet dvorane: " + e1.getDvorana().getKapacitet() + "\n");
		System.out.println(e2.getTipDogadjaja().toUpperCase() + "\n" + "Vreme odrzavanja: " + e2.getVreme());
		System.out.println("Lokacija: " + e2.getDvorana().getNaziv() + ", " + e2.getDvorana().getGrad());
		System.out.println("Kapacitet dvorane: " + e2.getDvorana().getKapacitet() + "\n");

		e1.getDvorana().setNaziv("Sava Centar");
		e1.getDvorana().setKapacitet(3700);
		System.out.println("Obavestenje: izmena lokacije dogadjaja ".toUpperCase() + e1.getTipDogadjaja().toUpperCase() + ". Nova lokacija: ".toUpperCase()
				+ e1.getDvorana().getNaziv().toUpperCase() + ", kapaciteta " + e1.getDvorana().getKapacitet() + " mesta." + "\n");

		System.out.println("Predstojeci sportski dogadjaji: ");
		System.out.println(e3.getTipDogadjaja().toUpperCase() + " (" + e3.getVreme() + "; " + e3.getDvorana().getNaziv() + ", "
				+ e3.getDvorana().getGrad() + ")" + ". Ulaznice u prodaji. Kapacitet: "
				+ e3.getDvorana().getKapacitet());
		System.out.println(e4.getTipDogadjaja().toUpperCase() + " (" + e4.getVreme() + "; " + e4.getDvorana().getNaziv() + ", "
				+ e4.getDvorana().getGrad() + ")" + ". Ulaznice u prodaji. Kapacitet: "
				+ e4.getDvorana().getKapacitet());

	}

}

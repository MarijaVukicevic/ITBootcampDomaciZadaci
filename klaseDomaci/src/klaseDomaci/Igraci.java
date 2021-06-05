package klaseDomaci;

public class Igraci {

	public static void main(String[] args) {
		
		Sportista s1 = new Sportista("Marko Markovic", "Kosarka", "Hemofarm", 3);
		Sportista s2 = new Sportista("Jovana Jovanovic", "Odbojka", "Partizan", 5);
		Sportista s3 = new Sportista("Petar Petrovic", "Fudbal", "Rad");
		
		String prviIgrac = s1.getImePrezime();
		System.out.println("Ime sportiste: " + prviIgrac + "\n" + "Sport: " + s1.getSport() + "\n" + "Klub: " + s1.getKlub() + "\n" + "Broj dresa: " + s1.getBroj() + "\n");
		
		String drugiIgrac = s2.getImePrezime();
		System.out.println("Ime sportiste: " + drugiIgrac + "\n" + "Sport: " + s2.getSport() + "\n" + "Klub: " + s2.getKlub() + "\n" + "Broj dresa: " + s2.getBroj() + "\n");
		
		s3.setBroj(14);
		String treciIgrac = s3.getImePrezime();
		System.out.println("Ime sportiste: " + treciIgrac + "\n" + "Sport: " + s3.getSport() + "\n" + "Klub: " + s3.getKlub() + "\n" + "Broj dresa: " + s3.getBroj() + "\n");
				
		System.out.println("Kosarkaski transferi u sezoni 2021/22:" + "\n");
		System.out.println("Igrac: " + prviIgrac + "\n" + "Prethodni klub: " + s1.getKlub() + "\n" + "Prethodni broj dresa: " + s1.getBroj() + "\n");
		
		s1.setKlub("Crvena zvezda");
		s1.setBroj(7);
		System.out.println("Novi klub: " + s1.getKlub() + "\n" + "Novi broj dresa: " + s1.getBroj());

	}

}

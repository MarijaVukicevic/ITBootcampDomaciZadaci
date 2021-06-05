package klaseDomaci;

public class Voznja {

	public static void main(String[] args) {

		Automobil a1 = new Automobil("Audi", "A3", 111222, "Jovana Jovanovic");
		Automobil a2 = new Automobil("Ford", "Focus", 333444, "Marko Markovic");
		Automobil a3 = new Automobil("Toyota", "Yaris", 555666);

		String markaModelPrviAuto = a1.getMarka() + " " + a1.getModel();
		System.out.println("Automobil 1: " + markaModelPrviAuto);

		System.out.println("Serijski broj automobila " + markaModelPrviAuto + ": " + a1.getSerijskiBroj());

		System.out.println("Vlasnik automobila " + markaModelPrviAuto + ": " + a1.getVlasnik() + "\n");

		String markaModelDrugiAuto = a2.getMarka() + " " + a2.getModel();
		System.out.println("Automobil 2: " + markaModelDrugiAuto);

		System.out.println("Serijski broj automobila " + markaModelDrugiAuto + ": " + a2.getSerijskiBroj());

		System.out.println("Vlasnik automobila " + markaModelDrugiAuto + ": " + a2.getVlasnik() + "\n");

		String markaModelTreciAuto = a3.getMarka() + " " + a3.getModel();
		System.out.println("Automobil 3: " + markaModelTreciAuto);

		System.out.println("Serijski broj automobila " + markaModelTreciAuto + ": " + a3.getSerijskiBroj());

		a3.setVlasnik("Petar Petrovic");
		System.out.println("Vlasnik automobila " + markaModelTreciAuto + ": " + a3.getVlasnik() + "\n");

		a1.setVlasnik("Ivana Ivanovic");
		System.out.println("Novi vlasnik automobila " + markaModelPrviAuto + ": " + a1.getVlasnik() + "\n");

	}

}

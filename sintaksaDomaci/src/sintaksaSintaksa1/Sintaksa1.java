package sintaksaSintaksa1;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double duzina, sirina, visina;
		
		System.out.print("Unesi duzinu: ");
        duzina = sc.nextDouble();
        
        System.out.print("Unesi sirinu: ");
        sirina = sc.nextDouble();
	
        System.out.print("Unesi visinu: ");
        visina = sc.nextDouble();
        
        double ukupnaPovrsina = 2 * (duzina * sirina + duzina * visina + sirina * visina);
        
        double povrsinaPoda = duzina * sirina;
        
        double okrecenaPovrsina = ukupnaPovrsina - povrsinaPoda;
        
        System.out.println("Povrsina okrecene prostorije: " +okrecenaPovrsina);
	
	
	
	}
	

}

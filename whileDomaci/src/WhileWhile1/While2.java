package WhileWhile1;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		/*Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 * onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta */

		int lakuNoc = 1;
		int ponavljanja;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj ponavljanja poruke: ");
		ponavljanja=sc.nextInt();
		
		while (lakuNoc <= ponavljanja) {
			System.out.println("Laku noc!");
			lakuNoc++;			
	 }						
   }
}



package forFor1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/* Napisati program koji ce omoguciti korisniku da unosi reci, sve dok ne unese rec “stop”, 
		 * nebitno da li je koristio mala, velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.*/

		Scanner sc = new Scanner(System.in);		
			
		String s1;
		
		String s2 = "stop";
						
		System.out.println("Unesite rec: ");		
		s1 = sc.nextLine();
		
			while (!s1.equalsIgnoreCase(s2)) {
			System.out.println("Ponovo unesite rec: ");
			s1 = sc.nextLine();
					
		} System.out.println("Ne mozete vise unositi reci.");											
	}	
}
	
	

		
		
		
	



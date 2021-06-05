package GrananjaGrananja1;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {
		/* Napisati program koji na osnovu unete godine i 
		   meseca ispisuje koliko taj mesec ima dana. 
		  (Vodite racuna o prestupnoj godini!)
		  wikipedia:  Prestupna je svaka 4. godina, sem u slucaju da je deljiva sa 100 a nije sa 400. 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Uneti godinu:");
		
		int godina = sc.nextInt();
				
		
		System.out.print("Uneti mesec (slovima):");
		
		String mesec = sc.next();
		
	
		switch (mesec) {
		
		case "Januar": 
			System.out.println("Januar "+godina+". godine: 31 dan.");
			break;
		
		case "januar": 
			System.out.println("Januar "+godina+". godine: 31 dan.");
			break;
			
		case "Februar":
			if (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 ==0)){
				System.out.println("Februar "+godina+". godine: 29 dana.");
			} else {
				System.out.println("Februar "+godina+". godine: 28 dana.");
			}
			break;
			
		case "februar":
			if (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 ==0)){
				System.out.println("Februar "+godina+". godine: 29 dana.");
			} else {
				System.out.println("Februar "+godina+". godine: 28 dana.");
			}
			break;
			
		case "Mart": 
			System.out.println("Mart "+godina+". godine: 31 dan.");
			break;
			
		case "mart": 
			System.out.println("Mart "+godina+". godine: 31 dan.");
			break;
			
		case "April": 
			System.out.println("April "+godina+". godine: 30 dana.");
			break;
			
		case "april": 
			System.out.println("April "+godina+". godine: 30 dana.");
			break;
			
		case "Maj": 
			System.out.println("Maj "+godina+". godine: 31 dan.");
			break;
			
		case "maj": 
			System.out.println("Maj "+godina+". godine: 31 dan.");
			break;
			
		case "Jun": 
			System.out.println("Jun "+godina+". godine: 30 dana.");
			break;
		
		case "jun": 
			System.out.println("Jun "+godina+". godine: 30 dana.");
			break;
			
		case "Jul":
			System.out.println("Jul "+godina+". godine: 31. dan.");
			break;
			
		case "jul":
			System.out.println("Jul "+godina+". godine: 31. dan.");
			break;
			
		case "Avgust":
			System.out.println("Avgust "+godina+". godine: 31. dan.");
			break;
			
		case "avgust":
			System.out.println("Avgust "+godina+". godine: 31. dan.");
			break;
			
		case "Septembar": 
			System.out.println("Septembar "+godina+". godine: 30 dana.");
			break;
		
		case "septembar": 
			System.out.println("Septembar "+godina+". godine: 30 dana.");
			break;
			
		case "Oktobar": 
			System.out.println("Oktobar "+godina+". godine: 31 dan.");
			break;
		
		case "oktobar": 
			System.out.println("Oktobar "+godina+". godine: 31 dan.");
			break;
			
		case "Novembar": 
			System.out.println("Novembar "+godina+". godine: 30 dana.");
			break;
			
		case "novembar": 
			System.out.println("Novembar "+godina+". godine: 30 dana.");
			break;
			
		case "Decembar": 
			System.out.println("Decembar "+godina+". godine: 31 dan.");
			break;
		
		case "decembar": 
			System.out.println("Decembar "+godina+". godine: 31 dan.");
			break;
		
		default: 
			System.out.println("Unete vrednosti nisu validne.");
		}
	}

}

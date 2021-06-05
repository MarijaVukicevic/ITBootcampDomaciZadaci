package GrananjaGrananja1;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {
		/*Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas) -
		 *  za resavanje ovog zadatka koristiti switch
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Uneti mesec:");
		
		String mesec = sc.next();
		
		switch (mesec) {
		case "Januar":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: Januar, Jun i Jul.");
			break;
		case "januar":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: januar, jun i jul.");	
			break;
		case "Februar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo F.");
			break;
		case "februar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo F.");	
			break;
		case "Mart":
			System.out.println("Mesec: "+ mesec + ". Na slovo M pocinju ukupno dva meseca: Mart i Maj.");
			break;
		case "mart":
			System.out.println("Mesec: "+ mesec + ". Na slovo M pocinju ukupno dva meseca: mart i maj.");
			break;
		case "April":
			System.out.println("Mesec: "+ mesec + ". Na slovo A pocinju ukupno dva meseca: April i Avgust.");
			break;
		case "april":
			System.out.println("Mesec: "+ mesec + ". Na slovo A pocinju ukupno dva meseca: april i avgust.");
			break;
		case "Maj":
			System.out.println("Mesec: "+ mesec + ". Na slovo M pocinju ukupno dva meseca: Mart i Maj.");
			break;
		case "maj":
			System.out.println("Mesec: "+ mesec + ". Na slovo M pocinju ukupno dva meseca: mart i maj.");
			break;
		case "Jun":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: Januar, Jun i Jul.");
			break;
		case "jun":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: januar, jun i jul.");
			break;
		case "Jul":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: Januar, Jun i Jul.");
			break;
		case "jul":
			System.out.println("Mesec: "+ mesec + ". Na slovo J pocinju ukupno tri meseca: januar, jun i jul.");
			break;
		case "Avgust":
			System.out.println("Mesec: "+ mesec + ". Na slovo A pocinju ukupno dva meseca: April i Avgust.");
			break;
		case "avgust":
			System.out.println("Mesec: "+ mesec + ". Na slovo A pocinju ukupno dva meseca: april i avgust.");
			break;
		case "Septembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo S.");
			break;
		case "septembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo S.");
			break;
		case "Oktobar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo O.");
			break;
		case "oktobar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo O.");
			break;
		case "Novembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo N.");
			break;
		case "novembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo N.");
			break;
		case "Decembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo D.");
			break;
		case "decembar":
			System.out.println("Mesec: "+ mesec + ". Ovo je jedini mesec koji pocinje na slovo D.");
			break;
		default:
			System.out.println("Nepostojeci mesec.");
		}
		

	}

}

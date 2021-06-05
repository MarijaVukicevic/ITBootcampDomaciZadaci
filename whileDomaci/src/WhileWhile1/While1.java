package WhileWhile1;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		/* Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
		 *  i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 * primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11 */

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		while (b >= 0) {	
			System.out.println("Sabrati sa:");
			b = sc.nextInt();
			
			if (b < 0) {
				b = 0;
			}
			a = a + b;
			System.out.println(a);
		}

	}

}
package apachePOIDomaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ApachePOI {

	public static void main(String[] args) {
//Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi.
//U tabeli svi brojevi se nalaze u prvoj koloni.
//Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
//Ukupnu sumu na kraju treba ispisati na standardnom izlazu.
//Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.

		File f = new File("domaci.xls");

		try {
			InputStream is = new FileInputStream(f);
			HSSFWorkbook wb = new HSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);

			double zbir = 0;

			int zadnjiIndex = sheet.getLastRowNum();

			for (int i = 0; i <= zadnjiIndex; i++) {

				zbir = zbir + sheet.getRow(0 + i).getCell(0).getNumericCellValue();
			}

			System.out.println(zbir);

			wb.close();

		} catch (IOException e) {
			System.out.println("Odgovarajuci fajl nije pronadjen.");
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			System.out.println("Preskoceno polje.");
			e.printStackTrace();
		}

	}

}

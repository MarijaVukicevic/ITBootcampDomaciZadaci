package seleniumUvodDomaci;
//Testiranje sajta http://demo.guru99.com/test/newtours/
//1.Koristiti razlicite moguce lokatore za pronalazenje elemenata - isprobati vise nacina;
//Zapamtiti lokacije u konstantama
//2.Za registracionu formu popuniti bug report, koristiti vec prosledjen template-
//naci i napisati bar 5 bagova. Testiranje sajta u ovu svrhu obaviti manuelno

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String LOGIN_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"; //SIGN-ON
	public static final String REGISTER_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	public static final String SUPPORT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a";
	public static final String CONTACT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a";
	public static final String HOME_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a";
	public static final String FLIGHTS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
	public static final String HOTELS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a";
	public static final String CARRENTALS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a";
	public static final String CRUISES_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a";
	public static final String DEST_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a";
	public static final String VAC_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a";
	public static final String TXTUSERNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input";
	public static final String TXTPASS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input";
	public static final String SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input";
	public static final String YOURDEST_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a";
	public static final String FEATVACDEST_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[8]/td/table/tbody/tr/td[2]/font/a";
	public static final String REGHERE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a";		
	public static final String BUSINESSTRVL_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]";
	public static final String SALONTRVL_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[2]";
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();						
	driver.get(URL);
	
	WebElement login = driver.findElement(By.xpath(LOGIN_XPATH));		
	//driver.findElement(By.linkText("SIGN-ON"));
	//driver.findElement(By.partialLinkText("SIG"));
	
	WebElement register = driver.findElement(By.xpath(REGISTER_XPATH));	
	//driver.findElement(By.linkText("REGISTER"));
	//driver.findElement(By.partialLinkText("REG"));
	
	WebElement support = driver.findElement(By.xpath(SUPPORT_XPATH));
	//support.click();
	//driver.findElement(By.linkText("SUPPORT"));
	//driver.findElement(By.partialLinkText("SUP")).click();
	
	WebElement contact = driver.findElement(By.xpath(CONTACT_XPATH));
	//contact.click();
	//driver.findElement(By.linkText("CONTACT")).click();
	//driver.findElement(By.partialLinkText("CON")).click();
	
	WebElement home = driver.findElement(By.xpath(HOME_XPATH));
	//home.click();
	//driver.findElement(By.linkText("Home")).click();
	//driver.findElement(By.partialLinkText("Hom")).click();
	
	WebElement flights = driver.findElement(By.xpath(FLIGHTS_XPATH));
	//flights.click();
	//driver.findElement(By.linkText("Flights")).click();
	//driver.findElement(By.partialLinkText("Fli")).click();
	
	WebElement hotels = driver.findElement(By.xpath(HOTELS_XPATH));
	//hotels.click();
	//driver.findElement(By.linkText("Hotels")).click();
	//driver.findElement(By.partialLinkText("Hot")).click();
	
	WebElement carRentals = driver.findElement(By.xpath(CARRENTALS_XPATH));
	//driver.findElement(By.linkText("Car Rentals")).click();
	//driver.findElement(By.partialLinkText("Car")).click();
	
	WebElement cruises = driver.findElement(By.xpath(CRUISES_XPATH));
	//cruises.click();
	//driver.findElement(By.linkText("Cruises")).click();
	//driver.findElement(By.partialLinkText("Cru")).click();
	
	WebElement destinations = driver.findElement(By.xpath(DEST_XPATH));
	//destinations.click();
	//driver.findElement(By.linkText("Destinations")).click();
	//driver.findElement(By.partialLinkText("Des")).click();
	
	WebElement vacations = driver.findElement(By.xpath(VAC_XPATH));
	//vacations.click();
	//driver.findElement(By.linkText("Vacations")).click();
	//driver.findElement(By.partialLinkText("Vac")).click();
	
	WebElement username = driver.findElement(By.xpath(TXTUSERNAME_XPATH));
	//WebElement username = driver.findElement(By.name("userName"));
	//username.sendKeys("MarVuk");
	
	WebElement pass = driver.findElement(By.xpath(TXTPASS_XPATH));	
	//WebElement pass = driver.findElement(By.name("password"));
	//pass.sendKeys("1234567");
	
	WebElement submit = driver.findElement(By.xpath(SUBMIT_XPATH));	
	//submit.click();
	
	WebElement yourDest = driver.findElement(By.xpath(YOURDEST_XPATH));
	//yourDest.click();
	//driver.findElement(By.linkText("Your destination")).click();
	//driver.findElement(By.partialLinkText("You")).click();
	
	WebElement featVacDest = driver.findElement(By.xpath(FEATVACDEST_XPATH));
	//featVacDest.click();
	//driver.findElement(By.linkText("Featured vacation destinations")).click();
	//driver.findElement(By.partialLinkText("Fea")).click();
	
	WebElement regHere = driver.findElement(By.xpath(REGHERE_XPATH));
	//regHere.click();
	//driver.findElement(By.linkText("Register here")).click();
	//driver.findElement(By.partialLinkText("Register h")).click();
	
	WebElement businessTravel = driver.findElement(By.xpath(BUSINESSTRVL_XPATH));
	//businessTravel.click();
	//driver.findElement(By.linkText("Business Travel @ About.com")).click();
	//driver.findElement(By.partialLinkText("Bus")).click();
	
	WebElement salonTravel = driver.findElement(By.xpath(SALONTRVL_XPATH));
	//salonTravel.click();
	//driver.findElement(By.linkText("Salon Travel")).click();
	//driver.findElement(By.partialLinkText("Sal")).click();
	
	
	
	
	
	

}
}
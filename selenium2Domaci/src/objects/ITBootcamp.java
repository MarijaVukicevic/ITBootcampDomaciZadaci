package objects;
//Pomocu jave i seleniuma
//Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
//Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
//U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja,
//ako to ne pomaze, guglajte)
//Dokazati da prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom
//tako sto cete napraviti screenshot stranice. nakon pretrage - istraziti na netu kako.
//Pomocu testNG-ja proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ITBootcamp {

	public static final String URL = "https://www.itbootcamp.rs/";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String EXPECTEDURL = "https://itbootcamp.rs/donacije/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Dimension windowSize = driver.manage().window().getSize();

		driver.manage().window().maximize();

		System.out.println("Title is: " + driver.getTitle());

		driver.navigate().refresh();
		driver.navigate().to("https://itbootcamp.rs/kontakt/");
		driver.navigate().back();
		driver.navigate().forward();

		WebElement search = driver.findElement(By.xpath(SEARCH_XPATH));
		search.click();
		WebElement inputSearch = driver.findElement(By.name("s"));
		inputSearch.sendKeys("testiranje");
		inputSearch.sendKeys(Keys.ENTER);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:/Users/Marija/Desktop/screenshot/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().window().setSize(windowSize);
		driver.close();
	}

	public static void clickDonBtn(WebDriver driver) {
		driver.findElement(By.id("menu-item-6402")).click();

	}

}

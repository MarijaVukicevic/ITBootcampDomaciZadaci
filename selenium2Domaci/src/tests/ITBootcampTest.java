package tests;
//Pomocu testNG-ja proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.ITBootcamp;

public class ITBootcampTest {
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testDonationsBtn() {
		driver.navigate().to(ITBootcamp.URL);
		driver.manage().window().maximize();
		ITBootcamp.clickDonBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = ITBootcamp.EXPECTEDURL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}

}

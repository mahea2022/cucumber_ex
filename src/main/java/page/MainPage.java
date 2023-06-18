package page;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	 WebDriver driver;
@Test
	public void init () {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.get("https://techfios.com/test/106/index.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
		
	}

}

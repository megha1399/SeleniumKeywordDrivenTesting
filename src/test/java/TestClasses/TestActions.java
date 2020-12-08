package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActions {

	static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void navigate() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	public static void clickbtn() {
		driver.findElement(By.xpath("//*[@id='pt-login']/a")).click();
	}
}

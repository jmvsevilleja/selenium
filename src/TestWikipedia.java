import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","C:/Users/jmvse/Desktop/SELENIUM/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Users/jmvse/Desktop/SELENIUM/chromedriver_win32/chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Sofware");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
	}

}

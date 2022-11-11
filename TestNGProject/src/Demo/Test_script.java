package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_script
{
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Pomclass pmc = new Pomclass(driver);
		pmc.username("Hiiiii");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		pmc.username("Helloooo");
	}
}

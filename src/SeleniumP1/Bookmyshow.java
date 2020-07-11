package SeleniumP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow 
{
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/udaisinghrathore/Desktop/bin/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com");
	}
}

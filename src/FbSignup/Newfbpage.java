package FbSignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Newfbpage {
	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//for maximize
		driver.manage().window().maximize();
		
		
		// to click on create account button id="u_0_2"
		
		WebElement createaccount=driver.findElement(By.id("u_0_2"));
	      createaccount.click();
	       Thread.sleep(3000);
	      
	      // first name 
	  
	 	WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Amandeep");
		
		// surname 
		WebElement sname= driver.findElement(By.name("lastname"));
		sname.sendKeys("Deep");
		
		//reg_email__
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys("abcdeep@gmail.com");
	
		
		//reenter email reg_email_confirmation__
		WebElement remail= driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("abcdeep@gmail.com");
		

		//reg_passwd__
		WebElement pass= driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("abcde123445");
		
		
		//birthday_day
		WebElement bday=driver.findElement(By.name("birthday_day"));
		Select s=new Select(bday);
		s.selectByVisibleText("20");
		
		//bday mnth
		WebElement mnth=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(mnth);
		s1.selectByIndex(4);
		
		WebElement yr=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(yr);
		s2.selectByValue("1990");
		
		//Thread.sleep(3000);
		
		WebElement radio= driver.findElement(By.name("sex"));
		radio.click();
		
		
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	
	}

}

// this is for old facebook account 


package FbSignup;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signupform {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//for maximize
		driver.manage().window().maximize();
		
		//for locators username
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("Amandeep");
		
		// FOR SURNAME USING NAME LOCATOR
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("Thakur");
		
		//for email address using id loctor tagname#IDvalue
		
		WebElement email=driver.findElement(By.cssSelector("Input#u_0_r"));
		email.sendKeys("aman@selenium.com");
		
		WebElement reverify=driver.findElement(By.cssSelector("Input[name='reg_email_confirmation__']"));
		reverify.sendKeys("aman@selenium.com");
		
		//for new password  using ID locator
	     WebElement Newpassword = driver.findElement(By.id("password_step_input"));
	       Newpassword.sendKeys("aman123");
		
		//for dropdown
	      WebElement day=driver.findElement(By.name("birthday_day"));
	      day.sendKeys("29");
	      
	      // for dropdown
	      
	      WebElement month= driver.findElement(By.name("birthday_month"));
	      month.sendKeys("9");
	      
	      // for year
	      WebElement year= driver.findElement(By.id("year"));
	      year.sendKeys("1993");
	      
	      //gendr
	      WebElement gender=driver.findElement(By.name("sex"));
	      gender.click();
	      
	      //submit button
	      
	      WebElement submit=driver.findElement(By.name("websubmit"));
	      submit.click();
	    		
	      
	}

}

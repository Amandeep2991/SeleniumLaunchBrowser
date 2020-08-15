package FbSignup;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class signupusingscanner {

	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Scanner s= new Scanner(System.in);
		driver.get("https://www.facebook.com/");
		//for maximize
		driver.manage().window().maximize();
		
		
		WebElement createaccount=driver.findElement(By.id("u_0_2"));
	      createaccount.click();
	       Thread.sleep(3000);
	      
	   	System.out.println("Enter the first name: ");
	   	String Fname=s.nextLine();
	   	WebElement fname=driver.findElement(By.name("firstname"));
	   	fname.sendKeys(Fname);
	
		System.out.println("Enter the Last name: ");
		String lname=s.nextLine();
		WebElement sname= driver.findElement(By.name("lastname"));
	    sname.sendKeys(lname);
		
	   System.out.println("Enter the email address: ");
	   String femail=s.nextLine();
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys(femail);
	
		
		//reenter email reg_email_confirmation__
		System.out.println("Enter re email: ");
		String refmail=s.nextLine();
		WebElement remail= driver.findElement(By.name("reg_email_confirmation__"));
        remail.sendKeys(refmail);
		

		//reg_passwd__
		System.out.println("Enter password: ");
		String pwd=s.nextLine();
		WebElement pass= driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys(pwd);

		
		
		//birthday_day
		System.out.println("Add date: ");
		String date=s.nextLine();
		WebElement bday=driver.findElement(By.name("birthday_day"));
		bday.sendKeys(date);

		
		//bday mnth
		System.out.println("Add month: ");
		String month=s.nextLine();
		WebElement mnth=driver.findElement(By.name("birthday_month"));
		mnth.sendKeys(month);
		
		System.out.println("Add year: ");
		String year=s.nextLine(); 
		WebElement yr=driver.findElement(By.name("birthday_year"));
		yr.sendKeys(year);
		
		//Thread.sleep(3000);
		
		WebElement radio= driver.findElement(By.name("sex"));
		radio.click();
		
		
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	
	}



		
	}



	

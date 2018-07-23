package newpackage;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		login();	
		
	}
	public static void login() throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your username?");
		String user = s.next();
		System.out.println("What is your password?");
		String pass = s.next();
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("password")).sendKeys(pass);
	    driver.findElements(By.tagName("button")).get(0).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    while (true) {
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("Like")).click();
	    }
		}
}

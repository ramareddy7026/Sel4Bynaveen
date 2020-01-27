package selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendkeysCharsequence 
{
	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.navigate().to("http://qa.relyonstaging.com/login");
		WebElement un = driver.findElement(By.id("username"));
		StringBuffer username=new StringBuffer();
		username.append("Hello");
		username.append("ram");
		username.append("doors are open good to go");	
		//un.sendKeys(username,Keys.TAB);
		
		WebElement pwd = driver.findElement(By.name("password"));
		StringBuilder password=new StringBuilder();
		password.append("bye");
		password.append("guru");
		
		pwd.sendKeys(password);
		
		String space="";
		String ram="reddy";
		//cobination
		un.sendKeys(username,space,password,Keys.TAB);
		
	}

}

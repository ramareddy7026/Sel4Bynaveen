package selenium4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabhandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		WebDriver newtab = driver.switchTo().newWindow(WindowType.WINDOW);//to open new window 
		Thread.sleep(5000);
	//	driver.switchTo().newWindow(WindowType.TAB);//to open new tab
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL); 
//		robot.keyPress(KeyEvent.VK_T); 
//		robot.keyRelease(KeyEvent.VK_CONTROL); 
//		robot.keyRelease(KeyEvent.VK_T);
//		robot.keyPress(KeyEvent.VK_CONTROL); 
//		robot.keyPress(KeyEvent.VK_N); 
//		robot.keyRelease(KeyEvent.VK_CONTROL); 
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keypress(KeyEvent.VK_A);
		
		
		
		
	}

}

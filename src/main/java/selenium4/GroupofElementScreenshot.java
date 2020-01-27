package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GroupofElementScreenshot 
{
 public static void main(String[] args) throws IOException {
	 	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//driver.get("https://www.w3schools.com/html/html_tables.asp");//https://app.hubspot.com/signup-v2/sales/step/user-info
//		driver.get("https://app.hubspot.com/signup-v2/sales/step/user-info");
//		WebElement groupofelements=driver.findElement(By.id("customers"));
//		String path="D:\\eclipse\\20190918\\selenium4\\Screenshots"+"Hubspotelements.png";
//		File from = groupofelements.getScreenshotAs(OutputType.FILE);
//		File to=new File(path);
//		FileHandler.copy(from, to);
		
		driver.get("https://app.hubspot.com/signup-v2/sales/step/user-info");//HUBSPOT ELEMENT
		WebElement groupofelements=driver.findElement(By.xpath("//form"));
		String path="D:\\eclipse\\20190918\\selenium4\\Screenshots"+"Hubspotelements1.png";
		File from = groupofelements.getScreenshotAs(OutputType.FILE);
		File to=new File(path);
		FileHandler.copy(from, to);
}
}
//Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
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

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://relyonite.com/login.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("1380");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("9319");
		String path="D:\\eclipse\\20190918\\selenium4\\Screenshots"+"username.png";
		File from = username.getScreenshotAs(OutputType.FILE);
		File to=new File(path);
		FileHandler.copy(from, to);
		String path1="D:\\eclipse\\20190918\\selenium4\\Screenshots"+"password.png";
		File from1 = username.getScreenshotAs(OutputType.FILE);
		File to1=new File(path1);
		FileHandler.copy(from1, to1);
//		public static void takeElementscreenshot(WebElement element,String filename)
//		{
//			
//		}
//		public static void takeElementphoto(WebElement element,String filename) 
//		{
//			String path="D:\\eclipse\\20190918\\selenium4\\Screenshots"+"filename.png";
//			File from = element.getScreenshotAs(OutputType.FILE);
//			File to=new File(path);
//			FileHandler.copy(from, to);
//			//FileUtils.copyFile(src, dest);
//		}
//		File from = username.getScreenshotAs(OutputType.FILE);
//		File to=new File(path);
//		FileHandler.copy(from, to);
		//FileUtils.copyFile(src, dest);

	}

}

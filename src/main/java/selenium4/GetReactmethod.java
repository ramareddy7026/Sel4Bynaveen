package selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReactmethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://relyonite.com/login.php");
		WebElement username = driver.findElement(By.id("username"));
		//selenium3
		Point p = username.getLocation();//for x,y
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Dimension d=username.getSize();//for height and width
		System.out.println(d.width);
		System.out.println(d.height);
		
		
		//selenium4 getreact() performs like square(x,y,height,width)
		Rectangle square = username.getRect();
		System.out.println(square.getX());
		System.out.println(square.getY());
		System.out.println(square.getWidth());
		System.out.println(square.getHeight()); 
		
		
		
	}

}

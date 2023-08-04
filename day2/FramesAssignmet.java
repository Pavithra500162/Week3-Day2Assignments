package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignmet {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		List<WebElement> noofframes=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frame: "+noofframes.size());
		driver.close();
	}

}

package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		a.dismiss();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		a.sendKeys("OK");
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		a.sendKeys("Cancel");
		System.out.println(a.getText());
		a.dismiss();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String a1=driver.findElement(By.xpath("//span[text()='Yes']")).getText();
		System.out.println(a1);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.close();
	}

}

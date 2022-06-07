package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("mrinmoysantra157@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ihatemyselfthemostiamtheworst9850346928");
		driver.findElement(By.name("login")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Your profile']/*[name()='svg']")).click();
//		driver.findElement(By.xpath("//div[@class='qzhwtbm6 knvmm38d']/descendant::span[text()='Log Out']")).click();
		driver.findElement(By.xpath("//div[@data-visualcompletion=\"ignore-dynamic\"]/descendant::span[text()='Groups']")).click();
//		WebElement ele = driver.findElement(By.xpath("//div[@data-visualcompletion='ignore-dynamic']/descendant::span[text()='Pune Job Seekers']"));
//		Point value = ele.getLocation();
//		int x = value.getX();
//		int y=value.getY();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy("+x+","+y+")");
//		driver.findElement(By.xpath("//div[@data-visualcompletion='ignore-dynamic']/descendant::span[text()='Pune Job Seekers']")).click();
	}

}

package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbaySite {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		WebElement ele = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
		Select s= new Select(ele);
//		s.selectByValue("20081");
		s.selectByVisibleText("Antiques");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//img[@alt='Asian Antiques']")).click();
		driver.findElement(By.xpath("//img[@alt='India']")).click();
	}

}

package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingAttribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
//		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
//		System.out.println(ele.getAttribute("type"));
//		ele.sendKeys("shirts");
//		List<WebElement> value = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
//		for(WebElement a:value) {
//			System.out.println(a.getText());
//		}
		
		
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(ele).perform();
//		driver.findElement(By.xpath("//span[text()='Content & Devices']")).click();
		
//		WebElement loc1 = driver.findElement(By.xpath("//h2[text()='Gaming merchandise']"));
//		Point coordinates = loc1.getLocation();
//		int x=coordinates.getX();
//		int y=coordinates.getY();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy("+x+","+y+")");
//		driver.findElement(By.xpath("//h2[text()='Gaming merchandise']/ancestor::div[@id='eJp6KQMLZE7oWYi1aMJcMQ']/descendant::a[@aria-label='Apparel']")).click();
		
		
		WebElement ele = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select s= new Select(ele);
		s.selectByVisibleText("Beauty & Personal Care");
	}

}

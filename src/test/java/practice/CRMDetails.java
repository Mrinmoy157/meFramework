package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.objectRepo.ClickOnLeadsAddIcon;
import com.crm.objectRepo.HomePage;
import com.crm.objectRepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMDetails {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		LoginPage lp= new LoginPage(driver);
		lp.login();
		HomePage hp= new HomePage(driver);
		hp.clickOnLeads();
		ClickOnLeadsAddIcon c= new ClickOnLeadsAddIcon(driver);
		c.clickonAddIconImage();
	}

}

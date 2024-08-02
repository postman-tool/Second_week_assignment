package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String []args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("vijay");
		driver.findElement(By.name("lastname")).sendKeys("mithu");
		driver.findElement(By.name("reg_email__")).sendKeys("9952851500");
		driver.findElement(By.id("password_step_input")).sendKeys("VijayQA@123");
		WebElement DD = driver.findElement(By.id("day"));
		Select object = new Select(DD);
		object.selectByVisibleText("14");
		WebElement DY = driver.findElement(By.id("month"));
		Select object2 = new Select(DY);
		object2.selectByVisibleText("Oct");
		WebElement DYYYY = driver.findElement(By.id("year"));
		Select object3 = new Select(DYYYY);
		object3.selectByVisibleText("1994");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}

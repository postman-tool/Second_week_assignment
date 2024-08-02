package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithSelectClass {
	 public static void main(String []args)
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("(//input[contains(@class,'inputLogin')])[2]")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.xpath("//div[@id='label']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		 driver.findElement(By.id("accountName")).sendKeys("Mithuvijay");
		 driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		 WebElement DD = driver.findElement(By.name("industryEnumId"));
		 Select object = new Select(DD);
		 object.selectByVisibleText("Computer Software");
		 WebElement SDD = driver.findElement(By.name("ownershipEnumId"));
		 Select object2 = new Select(SDD);
		 object2.selectByVisibleText("S-Corporation");
		 WebElement EDD = driver.findElement(By.id("dataSourceId"));
		 Select object3 = new Select(EDD);
		 object3.selectByValue("LEAD_EMPLOYEE");
		 WebElement ECOM = driver.findElement(By.id("marketingCampaignId"));
		 Select object4 = new Select(ECOM);
		 object4.selectByIndex(6);
		 WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select object5 = new Select(state);
		 object5.selectByVisibleText("Texas");
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String expected = "Mithuvijay";
		 String actual = driver.findElement(By.xpath("//span[contains(text(),'Mithuvijay  (14103)')]")).getText();
		 if(expected.contains(actual))
		 {
			 System.out.println("Account name is correct");
		 }
		 else
		 {
			 System.out.println("Account name is not correct");
		 }
		 
		 
		 
		 
		 
		 
		 
	 }

}

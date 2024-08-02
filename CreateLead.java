package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String []args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[contains(@class,'inputLogin')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dedalus");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mithiran");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
		driver.findElement(By.className("smallSubmit")).click();
		String expected = "Software Tester";
		String actual = driver.findElement(By.xpath("//span[contains(text(),'Software Tester')]")).getText();
		if(expected.contains(actual))
		{
			System.out.println("Titkl is correct");
		}
		else
		{
			System.out.print("Title is incorrect");
		}
		
	}

}

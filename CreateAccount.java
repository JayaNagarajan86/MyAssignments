package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    System.out.println(driver.findElement(By.tagName("h2")).getText());
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automtion tester1234");
		String AccName= driver.findElement(By.id("accountName")).getText();
		 WebElement ind=driver.findElement(By.name("industryEnumId"));
		 Select ind1=new Select (ind);
		 ind1.selectByVisibleText("Computer Software" );
		 WebElement own=driver.findElement(By.name("ownershipEnumId"));
		 Select dd2=new Select (own);
		 dd2.selectByVisibleText("S-Corporation" );
		 WebElement sour=driver.findElement(By.name("dataSourceId"));
		 Select dd3=new Select (sour);
		 dd3.selectByValue("LEAD_EMPLOYEE");
		 Thread.sleep(2000);
		 
		 WebElement camp=driver.findElement(By.id("marketingCampaignId"));
		 Select dd4=new Select (camp);
		 dd4.selectByIndex(6);
		 WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select dd5=new Select (state);
		 dd5.selectByValue("TX");
		 
		 
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Account Details']")).getText());
		
		driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
	    System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Selenium Automtion tester1234')]")).getText());
		driver.close();
		
	}	

}

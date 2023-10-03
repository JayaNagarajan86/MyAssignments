package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Institution1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Firstname1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lastname1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Localname1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a test description1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testemail1@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select ss=new Select (state);
		 ss.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an imp note");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		 driver.close();
		 
		 
		 


	}

}

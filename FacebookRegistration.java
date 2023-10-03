package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("Captain");
		driver.findElement(By.name("lastname")).sendKeys("Amerca");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Winter2023$");
		driver.findElement(By.name("reg_email__")).sendKeys("CaptinAm@gmail.com");
		
		
		WebElement dob=driver.findElement(By.id("day"));
		Select dob_date = new Select (dob);
		dob_date.selectByVisibleText("4");
		
		WebElement fbmonth=driver.findElement(By.id("month"));
		Select month_m= new Select (fbmonth);
		month_m.selectByIndex(6);
		
		WebElement fbyear=driver.findElement(By.id("year"));
		Select fbyear_y= new Select (fbyear);
		fbyear_y.selectByValue("1985");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("CaptinAm@gmail.com");
		
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
	}

}

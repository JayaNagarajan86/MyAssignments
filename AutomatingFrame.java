package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100)); 
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();        
        System.out.println(alert.getText());
        
        alert.sendKeys("Samyukta");
        alert.accept();
        String pgText=driver.findElement(By.id("demo")).getText();
        System.out.println(pgText);
        if (pgText.contains("Hello Samyukta! How are you today?"))
        	{
        	   System.out.println("Try it button clicked successfully");
        	}
        else
        {
        	System.out.println("Try it Button click failed");
        }

	}

}

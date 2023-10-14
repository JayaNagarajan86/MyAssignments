package Week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://buythevalue.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70)); 
        driver.findElement(By.xpath("(//div[@class='enap-img'])[2]")).click();
        String windowHandle = driver.getWindowHandle();
        System.out.println("Parent window address: " +windowHandle);// address of the current window where the driver has control
        Set<String> windowHand = driver.getWindowHandles();
        System.out.println(windowHand.size());
        List<String> win = new ArrayList<String>(windowHand);
        //driver.switchTo().window(win.get(1));
        System.out.println("title of 1st child window " +driver.getTitle());
        driver.findElement(By.xpath("(//div[@class='product-image'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("600126");
        driver.findElement(By.xpath("//input[@value='Check']")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
        driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn harman_btn4']")).click();
        Alert alert = driver.switchTo().alert(); 
        System.out.println(alert.getText());
        alert.accept();
        driver.close();
        
        

	}

}

package Week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    System.out.println(driver.findElement(By.tagName("h2")).getText());
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Merge Contacts")).click();
	    //From Contact
	    driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
	    String windowHandle = driver.getWindowHandle();
        System.out.println("Parent window address: " +windowHandle);
        System.out.println(driver.getTitle());
        Set<String> windowHand = driver.getWindowHandles();
        System.out.println(windowHand.size());
        List<String> win = new ArrayList<String>(windowHand);
        driver.switchTo().window(win.get(1));
        System.out.println("title of 1st child window " +driver.getTitle());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        Thread.sleep(3000);
        WebElement findConTable=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
        List<WebElement> row = findConTable.findElements(By.tagName("a"));
		System.out.println(row.size());
		String firRowVal= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")).getText();
		System.out.println(firRowVal);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")).click();
		System.out.println("first resulting contact From Contact clicked successfully");
		driver.switchTo().window(win.get(0));
		//To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		String windowHandle1 = driver.getWindowHandle();
        System.out.println("Parent window address: " +windowHandle1);
        System.out.println(driver.getTitle());
        Set<String> windowHand1 = driver.getWindowHandles();
        System.out.println(windowHand1.size());
        List<String> win1 = new ArrayList<String>(windowHand1);
        driver.switchTo().window(win1.get(1));
        System.out.println("title of 1st child window " +driver.getTitle());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        
        WebElement findConTable1=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
        List<WebElement> row1 = findConTable1.findElements(By.tagName("a"));
		System.out.println(row1.size());
		String firRowVal1= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")).getText();
		System.out.println(firRowVal1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a))[2]")).click();
		System.out.println("Second resulting contact From Contact clicked successfully");
		driver.switchTo().window(win1.get(0));
		driver.findElement(By.linkText("Merge")).click();
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
	     alert.accept();
         String brwsrTitle=driver.getTitle();
         if (brwsrTitle.contains("View Contact")) {
        	 System.out.println("Merge happened successfully PageTitle is :" +brwsrTitle);
         }
         else
         {
        	 System.out.println("Merge didnt happen correctly" +brwsrTitle);
         }
	     
        
	}

}

package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		boolean selBrowRadio= driver.findElement(By.xpath("//label[text()='Edge']")).isSelected();
		System.out.println(selBrowRadio);
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selChenRadio=driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selChenRadio1=driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		if (selChenRadio1==true)
		{
			System.out.println("Chennai radio button is still selected on unselecting");
		}
		else
		{
			System.out.println("Chennai radio button is unselected");
		}
		
		boolean defaultSel=driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		if(defaultSel==true)
		{
		System.out.println("Safari button is enabled by default");
		}
		else
		{
			System.out.println("Safari button is not enabled by default");	
		}
		
		boolean ageRange=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("Age group (21-40 Years) button is enabled" +ageRange);
		
		
	}

}

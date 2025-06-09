package SeleniumPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		// We can do only 4 actions on alert. 
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Welcome");
		Thread.sleep(5000);
		alt.accept();
		
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Welcome to pune");

		
		
		driver.quit();
	}

}

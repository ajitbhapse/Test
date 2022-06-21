import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Go {
	
	
	WebDriver driver ;
	
	
	public void printLinks() {
		if(System.getProperty("BrowserName").equals("Chrome")) {
			System.out.println(System.getProperty("BrowserName"));
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.goibibo.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size()); 


		WebElement ourProducts = driver.findElement(By.xpath("//li[text()='our products']//parent::ul"));
		List<WebElement> linksOurProducts =  ourProducts.findElements(By.tagName("a"));
		System.out.println(linksOurProducts.size());  
	}

	public static void main(String[] args) {
		Go go = new Go();
		go.printLinks();
	}
}

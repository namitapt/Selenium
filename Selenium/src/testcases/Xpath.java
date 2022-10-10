package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.findElement(By.xpath("//input[@class = 'form-control']")).sendKeys("class");
		driver.findElement(By.xpath("//input[@placeholder = 'Message']")).sendKeys("placeholder");
		*/
		/*
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//a[@href = 'table-pagination.php']")).click();
		*/
		/*
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//*[text()='Form Submit']")).click();
		*/
		/*
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@class='check-box-list' and @id='check-box-two']")).click();
		*/
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@id = 'inlineRadio2' or @name = 'inlineRadioOptions']")).click();
		
		/*
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.findElement(By.xpath("//button[starts-with(@id,'normal')]")).click();
		*/
		/*
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//*[contains(@id,'modal')]")).click();
		*/
	
	}

}

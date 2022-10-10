package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		/*
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().alert().accept(); 
		*/
		/*
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/p[4]/button")).click();
		driver.switchTo().alert().dismiss();
		*/
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")).click();
		driver.switchTo().alert().sendKeys("Namita");
		driver.switchTo().alert().accept();

	}

}

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoInputFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://selenium.obsqurazone.com/index.php");
		d.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		d.findElement(By.id("value-a")).sendKeys("10");
		d.findElement(By.id("value-b")).sendKeys("15");
		d.findElement(By.id("button-two")).click();
		WebElement e=d.findElement(By.id("message-two"));
		System.out.println(e);
	}

}

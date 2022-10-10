package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.google.com/");
		WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		e.sendKeys("selenium");
		e.sendKeys(Keys.ENTER);
		*/
		
		driver.get("https://demoqa.com/text-box");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        name.sendKeys("Namita");
        name.sendKeys(Keys.TAB);
        
        
	}

}

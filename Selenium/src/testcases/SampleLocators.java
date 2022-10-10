package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLocators {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://selenium.obsqurazone.com/index.php");
		//d.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")).click(); //Navigating to input forms 
		//d.findElement(By.id("single-input-field")).sendKeys("Hey"); //"Hey" is given as an input
		//d.findElement(By.cssSelector("#collapsibleNavbar > ul > li:nth-child(4) > a")).click(); //CSS selector for table
		//d.findElement(By.className("list-group-item")).click();
		d.get("https://demo.guru99.com/test/newtours/");
		//d.findElement(By.linkText("SIGN-ON")).click();
		//d.findElement(By.partialLinkText("SIGN")).click();
		d.navigate().to("https://selenium.obsqurazone.com/index.php");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
	}

}

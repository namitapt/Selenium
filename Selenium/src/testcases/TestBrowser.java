package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {
	public static void main(String[] args) {
		String browser = "Firefox";
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\Firefox driver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.close();
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.close();
		}
	}
}
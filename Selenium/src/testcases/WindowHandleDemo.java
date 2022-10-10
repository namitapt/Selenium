package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/a")).click();
		Set<String> child = driver.getWindowHandles();
		for(String c: child) {
			System.out.println(c);
		}
		driver.switchTo().window("CDwindow-B8013E22DFC9970847F164E12EA50172");
		driver.close();
	}

}

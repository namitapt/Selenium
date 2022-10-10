package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	
		/*Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		//a.dragAndDrop(from, to).build().perform();
		Action dragAndDrop = a.clickAndHold(from).moveToElement(to).build();
		dragAndDrop.perform();
		*/
		
		
	}

}

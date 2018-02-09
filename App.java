package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
	WebDriver driver;

  public void Diag() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\PVCO\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		driver.get("http://localhost:8334/homePage");
		Thread.sleep(3000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id("advanceDiag")));
		Thread.sleep(3000);
		driver.findElement(By.id("advanceDiag")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("callDeviceStatus")).click();
		Thread.sleep(40000);
		driver.findElement(By.id("gotoAutoTest")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("issueType_displayTouch")).click();
		Thread.sleep(25000);
		driver.findElement(By.id("display")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("settingExpectation_goToAutoTest")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("manualTest")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("LCDTest")).click();
		Thread.sleep(5000);		
  }
}

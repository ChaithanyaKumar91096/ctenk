package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ConfirmationDialog {
	WebDriver driver;

  @Test
  public void alertokbutton() throws Exception {
driver.get("https://www.stechies.com/code-examples/Alert-Message-PHP-JavaScript-alert.php");
Thread.sleep(6000);
//driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
//Thread.sleep(4000);
driver.switchTo().alert().accept();

}


  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

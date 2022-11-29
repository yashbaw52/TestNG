package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	WebDriver driver;
  @Test
  public void t1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demoqa.com/automation-practice-form");
	  
	  String title = "ToolsQA";
	  Assert.assertEquals(driver.getTitle(), title);
  }
  @BeforeMethod
	  public void beforemethod() {
	  System.out.println("Starting chrome browser");
		  
	  }
  @AfterMethod
  	public void aftermethod() {
	  driver.close();
	  System.out.println("Closing the browser");
	  
  }
  
  }


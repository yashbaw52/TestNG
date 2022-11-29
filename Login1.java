package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login1 {
	WebDriver driver;
	
	//for firstname and lastname
  @Test(priority = -1)
  public void t1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demoqa.com/automation-practice-form");
	  
	 driver.findElement(By.id("firstName")).sendKeys("abc");
	 driver.findElement(By.id("lastName")).sendKeys("admin");
  }
  @Test(dependsOnMethods = {"t1"})
  
  //for email and radio button
  public void t2() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demoqa.com/automation-practice-form");

	  driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
	  WebElement radio1 = driver.findElement(By.id("gender-radio-1"));
	  radio1.click();
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

package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
 	WebDriver driver = null;

 @BeforeTest
 public void beforeTest() throws Exception
  {
  driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
     driver.manage().window().maximize();
 }

 @Test
 public void iamNeo() throws InterruptedException 
 {
        
	// Navigate to iamneo.ai
	driver.get("http://iamneo.ai");

	// Navigate to Facebook page
	driver.navigate().to("https://www.facebook.com");
	
	// Navigate back to iamneo.ai
	driver.navigate().back();
	
	// Print the URL of the current page
	System.out.println("Current URL: " + driver.getCurrentUrl());
	
	// Navigate forward
	driver.navigate().forward();
	
	// Reload the page
	driver.navigate().refresh();

}

 @AfterTest
 public void afterTest() 
 {
  driver.quit();
 }

}
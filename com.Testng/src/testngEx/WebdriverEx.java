package testngEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebdriverEx {
	
	@Test(dataProvider="dp")
	public void test01(String uname,String pass) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/Selenium%20Soft/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	
	}
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "kiran@gmail.com", "123456" },
	      new Object[] { "Kiran@gmail.com", "12345" },
	    };
	  }

}

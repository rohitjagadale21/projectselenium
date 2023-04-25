package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupOfRadioButton {
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
         List<WebElement> gender = driver.findElements(By.xpath("//input[@name='radiooptions']"));
         selectRadio(gender, "Male");
	}

	 public void selectRadio(List<WebElement> radios,String text) {
		for(WebElement radio: radios) {
			if(radio.getAttribute("value").equals(text)) {
				radio.click();
				break;
			}
		}
	}
      
        
         
}
	


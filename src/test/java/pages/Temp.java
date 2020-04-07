package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Temp {

	WebDriver driver=null;
	
	By FN=By.id("prasad");
	
	public Temp() {
		PageFactory.initElements(driver,this);
	}
	
	public void temp(){
		driver.findElement(FN).sendKeys("");
	}

}

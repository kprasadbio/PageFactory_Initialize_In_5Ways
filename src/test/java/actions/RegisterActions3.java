package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage3;

public class RegisterActions3 {
	
	static WebDriver driver=null;
	RegisterPage3 regPage=PageFactory.initElements(driver(), RegisterPage3.class);
	
	static{
		launch();
	}
	
	/**
	 * @param FN
	 * @param SN
	 * @param email
	 * @Description: this method inputs test data to respective webelements
	 */
	public void registerWithValidData(String FN,String SN, String email){
		
		regPage.inputUserName(FN);
		regPage.inputSurName(SN);
		regPage.inputeMail(email);
	}
	
	/**
	 * @Description: this method returns the driver objects
	 * @return
	 */
	public static WebDriver driver(){
		return driver;
	}
	
	/**
	 * @Description: this method launches the browser and navigates to the provided URL
	 */
	public static void launch(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	
	public void teardown(){
		driver.quit();
	}

}

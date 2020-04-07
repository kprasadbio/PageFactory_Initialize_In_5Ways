package actions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage2;

public class RegisterActions2 {
	
	static WebDriver driver=null; 
	
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
		
		PageFactory.initElements(driver, RegisterPage2.class);
		RegisterPage2.inputUserName(FN);
		RegisterPage2.inputSurName(SN);
		RegisterPage2.inputeMail(email);
		
		//disadvantage is to re-initialize the PF everytime when we have to re-use the same methods in other clases
	}
	
	/**
	 * @Description: this method returns the driver objects
	 * @return
	 */
	public static SearchContext driver(){
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

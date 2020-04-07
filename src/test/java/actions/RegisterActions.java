package actions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage;

public class RegisterActions {
	
	static WebDriver driver=null;
	RegisterPage regPage=new RegisterPage(driver);
	
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
		
		regPage.inputUserName(FN).inputSurName(SN).inputeMail(email);
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

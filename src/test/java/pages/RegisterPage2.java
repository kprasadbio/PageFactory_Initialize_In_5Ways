package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage2 { 
	
	@FindBy(xpath="//input[@name='firstname']")
	 private static WebElement txt_FN;
	
	@FindBy(xpath="//input[@name='lastname']")
	 private static WebElement txt_SN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	 private static WebElement txt_eMail;
	
	
	public static void inputUserName(String userName){
		
		txt_FN.sendKeys(userName); 
	}
	
	public static void inputSurName(String surname){
		
		txt_SN.sendKeys(surname); 
	}
	
	public static void inputeMail(String eMail){
		
		txt_eMail.sendKeys(eMail); 
	}
	
	 

}

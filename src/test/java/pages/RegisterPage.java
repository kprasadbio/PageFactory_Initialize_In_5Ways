package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage { 
	
	@FindBy(xpath="//input[@name='firstname']")
	 private WebElement txt_FN;
	
	@FindBy(xpath="//input[@name='lastname']")
	 private WebElement txt_SN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	 private WebElement txt_eMail;
	
	
	public RegisterPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	
	
	public RegisterPage inputUserName(String userName){
		
		txt_FN.sendKeys(userName);
		
		return this;
	}
	
	public RegisterPage inputSurName(String surname){
		
		txt_SN.sendKeys(surname);
		
		return this;
	}
	
	public RegisterPage inputeMail(String eMail){
		
		txt_eMail.sendKeys(eMail);
		
		return this;
	}
	
	 

}

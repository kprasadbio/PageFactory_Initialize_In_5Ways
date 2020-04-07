package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage3 { 
	
	@FindBy(xpath="//input[@name='firstname']")
	 private WebElement txt_FN;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	 private WebElement txt_SN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	 private WebElement txt_eMail;
	
	
	public void inputUserName(String userName){
		
		txt_FN.sendKeys(userName); 
	}
	
	public void inputSurName(String surname){
		
		txt_SN.sendKeys(surname); 
	}
	
	public void inputeMail(String eMail){
		
		txt_eMail.sendKeys(eMail); 
	}
	
	 

}

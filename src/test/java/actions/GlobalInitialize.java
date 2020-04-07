package actions;



import org.openqa.selenium.support.PageFactory;

import pages.RegisterPage4;

public class GlobalInitialize {
	
	 
	
	public static RegisterPage4 registerPage4(){ 
		 
		return PageFactory.initElements(RegisterActions4.driver(), RegisterPage4.class);
	}

	

}

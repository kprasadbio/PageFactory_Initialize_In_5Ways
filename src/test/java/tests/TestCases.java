package tests;

import org.testng.annotations.Test;

import actions.GlobalInitialize;
import actions.RegisterActions;
import actions.RegisterActions2;
import actions.RegisterActions3;

public class TestCases {
	
	RegisterActions pageactions=new RegisterActions();
	RegisterActions2 pageactions2=new RegisterActions2();
	RegisterActions3 pageactions3=new RegisterActions3();
	
	
	
	@Test
	public void test(){
		pageactions.registerWithValidData("prasad", "surname","email@test.com");
		pageactions.teardown();
	}
	
	@Test
	public void test2(){
		pageactions2.registerWithValidData("prasad", "surname","email@test.com");
		pageactions2.teardown();
	}
	
	@Test
	public void test3(){
		pageactions3.registerWithValidData("prasad", "surname","email@test.com");
		pageactions3.teardown();
	}
	
	@Test
	public void test4(){
		 GlobalInitialize.registerPage4().inputUserName("Prasad");
		 GlobalInitialize.registerPage4().inputSurName("Automation");
		 GlobalInitialize.registerPage4().inputeMail("test@mail.com");
	}
	

}

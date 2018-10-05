package testsuite;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Choosebrowser;

import page.Loginwithpagefactory;

public class Pagefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driv=Choosebrowser.getDriver("Chrome","http://newtours.demoaut.com/");
		Loginwithpagefactory tc=PageFactory.initElements(driv, Loginwithpagefactory.class);
		tc.login("123","123");
		
		
		}
	}

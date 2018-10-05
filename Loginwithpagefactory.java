package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Loginwithpagefactory {
	WebDriver driv;
	@FindBy(how=How.NAME,using="userName")
	@CacheLookup
	WebElement Uname;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement Upass;
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
	WebElement log;
public void login(String Uname1,String Upass1)
	{
		Uname.sendKeys(Uname1);
		Upass.sendKeys(Upass1);
		log.click();
	}
public void close()
{
	driv.close();
}
}
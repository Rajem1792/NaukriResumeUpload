package Naukri.com.Naukri.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") private WebElement UserName;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")private WebElement PassWord;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement Loginbutton;
	
	
	public Loginpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inputUserName(String UName)

	{
		 UserName.sendKeys(UName);
	}
	
	
	public void inputPassword(String password)

	{
		 PassWord.sendKeys(password);
	}
	
	public void clickOnLoginButton()

	{
		 Loginbutton.click();
	}
	
	
}

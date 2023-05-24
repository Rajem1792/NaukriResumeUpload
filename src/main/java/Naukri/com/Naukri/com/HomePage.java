package Naukri.com.Naukri.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(partialLinkText="Login")private WebElement LoginButton;
	
	@FindBy(css="div.view-profile-wrapper a") private WebElement ViewProfile;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnloginbuton()
	{
		LoginButton.click();
	}
	
	
	public void clickOnviewProfile()
	{
		ViewProfile.click();
	}
}

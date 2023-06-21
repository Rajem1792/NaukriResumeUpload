package Naukri.com.Naukri.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	
	@FindBy(partialLinkText="Login")private WebElement LoginButton;
	
	@FindBy(css="div.view-profile-wrapper a") private WebElement ViewProfile;
	@FindBy(xpath="//div[@class='chatbot_DrawerContentWrapper']/div/div[contains(@class,'crossIcon')]") private WebElement ChatBoat;
	
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

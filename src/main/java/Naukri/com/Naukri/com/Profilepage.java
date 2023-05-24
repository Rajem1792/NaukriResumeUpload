package Naukri.com.Naukri.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage {

	
	
	@FindBy(xpath="//i[text()='deleteOneTheme']") private WebElement Deleteresume;
	@FindBy(css="[class='lightbox model_open flipOpen'] button") private WebElement DeleteAgain;
	@FindBy(css="input#attachCV") private WebElement Uploadresume;
	@FindBy(css="div.nI-gNb-drawer__icon") private WebElement ProfileIcon;
	@FindBy(xpath="//a[@title='Logout']") private WebElement LogOut;
	
	
	public Profilepage(WebDriver driver)
	{
	    PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickondeletebutton()
	{
		 Deleteresume.click();
	}
	
	public void clickondeleteAgainbutton()
	{
		 DeleteAgain.click();
	}
	public void uploadResume(WebDriver driver)
	{
		//Uploadresume.click();
		
		// To upload the Resume
      
        
        Actions act=new Actions(driver);
        act.moveToElement(Uploadresume).click().build().perform();
	}
	
	public void clickOnProfileIcon()
	{
		ProfileIcon.click();
	}
	
	public void clickonLogout()
	{
		LogOut.click();
	}
	
}

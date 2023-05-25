package Naukri.com.Naukri.com;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryPackage.BaseClass;
import LibraryPackage.UtilityClass;

public class BengloreProfileTestClass extends BaseClass{

	
	
	HomePage HM;
	Loginpage LG;
	Profilepage PP;;
	
	@BeforeClass
	public void openChromebrowser()
	{
		chromeBrowser();
	}
	
	@Test
	public void deleteanduploadResumeonNaukriNoida() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HM=new HomePage(driver);
		LG=new Loginpage(driver);
		PP=new Profilepage(driver);
		
		
		HM.clickOnloginbuton();
		LG.inputUserName(UtilityClass.Data(0, 0));
		LG.inputPassword(UtilityClass.Data(1, 0));
		LG.clickOnLoginButton();
		HM.clickOnviewProfile();
		PP.clickondeletebutton();
		PP.clickondeleteAgainbutton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		PP.uploadResume(driver);
		
		
        // To execute the exe file from to upload
                 
           Runtime.getRuntime().exec("\"D:\\AutoITFiles1\\NoidaResume.exe\"");
           Thread.sleep(10000);
         
           driver.navigate().refresh();  
           
           Thread.sleep(3000);
           PP.clickOnProfileIcon();
           PP.clickonLogout();
		
	}
	@Test
	public void deleteanduploadResumeonNaukriPune() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HM=new HomePage(driver);
		LG=new Loginpage(driver);
		PP=new Profilepage(driver);
		
		
		HM.clickOnloginbuton();
		LG.inputUserName(UtilityClass.Data(3, 0));
		LG.inputPassword(UtilityClass.Data(4, 0));
		LG.clickOnLoginButton();
		HM.clickOnviewProfile();
		PP.clickondeletebutton();
		PP.clickondeleteAgainbutton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		PP.uploadResume(driver);
		
		
		 // To execute the exe file from to upload
        
        Runtime.getRuntime().exec("\"D:\\AutoITFiles1\\PuneResume.exe\"");
        Thread.sleep(10000);
        driver.navigate().refresh();  
        
        
        Thread.sleep(3000);
        PP.clickOnProfileIcon();
        PP.clickonLogout();
        
        driver.quit();
	}
	
	@Test
	public void deleteanduploadResumeonNaukriBanglore() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HM=new HomePage(driver);
		LG=new Loginpage(driver);
		PP=new Profilepage(driver);
		
		
		HM.clickOnloginbuton();
		LG.inputUserName(UtilityClass.Data(6, 0));
		LG.inputPassword(UtilityClass.Data(7, 0));
		LG.clickOnLoginButton();
		HM.clickOnviewProfile();
		PP.clickondeletebutton();
		PP.clickondeleteAgainbutton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		PP.uploadResume(driver);
		
		
		 // To execute the exe file from to upload
        
        Runtime.getRuntime().exec("\"D:\\AutoITFiles1\\bengloreResume.exe\"");
        Thread.sleep(10000);
        driver.navigate().refresh();    
        
        Thread.sleep(3000);
       PP.clickOnProfileIcon();
       PP.clickonLogout();
       
    
	}
	
}

package LibraryPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	
	public static String Data(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\EclipeNewWorkpsace\\Naukri.com\\DataFolder\\TestDataOfNaukri.com.xlsx");
		String dd = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return dd;
	}
	public static String Data1(String key) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\EclipeNewWorkpsace\\ECOMMERCE_AMAZON\\DataFolder\\importantData.properties");
		     Properties p=new Properties();
		     p.load(file);
		     String value=p.getProperty(key); 
		     return value;
	}
	

	public static void Screnshot(WebDriver driver) throws IOException
	{
		File Source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest1=new File("C:\\EclipeNewWorkpsace\\Naukri.com\\ScreenShots"+".png");
	     FileHandler.copy(Source1,dest1);
	}
	
	
}

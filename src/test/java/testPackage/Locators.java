package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators extends XMLUtils {

	public WebElement getLocator(String fileName,String locatorType,String locatorName,String locatorValue)
	{
		System.setProperty("webdriver.edge.driver", "D:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		WebElement element=null;
		switch(locatorType)
		{
		case "id":
		{
			element=driver.findElement(By.id(locatorValue));
			break;
		}
		case "name":
		{
			element=driver.findElement(By.name(locatorValue));
			break;
		}
		case "tagName":
		{
			element=driver.findElement(By.tagName(locatorValue));
			break;
		}
		case "className":
		{
			element=driver.findElement(By.className(locatorValue));
			break;
		}
		case "linkText":
		{
			element=driver.findElement(By.linkText(locatorValue));
			break;
		}
		case "partialLinkText":
		{
			element=driver.findElement(By.partialLinkText(locatorValue));
			break;
		}
		case "xpath":
		{
			element=driver.findElement(By.xpath(locatorValue));
			break;
		}
		case "cssSelector":
		{
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		}
		}
		 
		return element;
	}
	
	public static void main(String args[])
	{
		Locators l=new Locators();
		
	}
}

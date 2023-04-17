package SwagLabProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	//POM class2
	//Step1 Declaration
	 @FindBy (xpath="//div[@class='app_logo']")private WebElement logo;
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement openMenu;
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	 


//Usage
public void verifyLogo() {
boolean result = logo.isDisplayed();
if(result==true) {
System.out.println("Logo Found.....>Pass");	
}
else {
	System.out.println("logo not found ....>fail");
}
}
public void  clickONOpenMenu() {
	openMenu.click();
}
}
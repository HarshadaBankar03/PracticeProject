package SwagLabProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage {
	//Step1:Declaration
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;



//Step2:Initialization
public SwagLabMenuPage(WebDriver driver) {
	PageFactory.initElements( driver , this);
	
}
public void clickOnLogOut() {
	Logout.click();
}
}

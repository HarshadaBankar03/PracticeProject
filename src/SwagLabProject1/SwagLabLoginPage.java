package SwagLabProject1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class1
public class SwagLabLoginPage {
	//declaration
	@FindBy(xpath="//input[@placeholder=\"Username\"]")private WebElement UN;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement PWD;
	@FindBy(xpath="//input[@type=\"submit\"]")private WebElement Login;
	
	//Step 2:Initialization
	public SwagLabLoginPage(WebDriver  driver) {
		PageFactory.initElements(driver, this);
		
	}
	//step 3:Usage
	public void enterUN() {
		UN.sendKeys("standard_user");
	}
	public void enterPWD() {
		PWD.sendKeys("secret_sauce");
	}
	public void clickOnLoginButton() {
		Login.click();
	}

}

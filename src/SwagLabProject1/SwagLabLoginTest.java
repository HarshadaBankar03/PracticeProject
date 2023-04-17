package SwagLabProject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLabLoginTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.enterUN();
		login.enterPWD();
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		SwagLabHomePage home = new SwagLabHomePage(driver);
		home.verifyLogo();
		home.clickONOpenMenu();
		
		Thread.sleep(2000);
		
		
		SwagLabMenuPage menu = new SwagLabMenuPage(driver);
		menu.clickOnLogOut();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
	}	
		
	}



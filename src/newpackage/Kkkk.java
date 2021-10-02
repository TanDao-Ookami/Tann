package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Kkkk {

	public static void main(String[] args) {
		
		//navigation access
		String baseURL= "https://zombieclothingstore.com/account";
		int waitTime= 20;
		
		//values and locators storage
		String email= "vinhtranak02092k@gmail.com";
		String password= "Raul123";
		String TXT_EMAIL= "//form[@id=\"customer_login\"]//input[@id=\"customer_email\" and @type=\"email\" and @value]";
		String TXT_PASSWORD= "//form[@id=\"customer_login\"]//input[@id=\"customer_password\" and @type=\"password\" and @value]";
		String BTN_LOGIN= "//form[@id=\"customer_login\"]//input[@type=\"submit\"]";
		String LBL_EMAIL= "//div[@id=\"customer_sidebar\"]//following::p[contains(normalize-space(@class),\"email\")]";
		String BTN_LOGOUT= "//div[@class=\"AccountContent\"]//li[@class=\"last\"]//a[1]";
//		String ICO_LOGIN= "html.no-js body#lama-theme.index div.main-body header#site-header.main-header.mainHeader_temp01.header-style div.header-upper-middle div.container-fluid div.flexContainer-header div.col-md-4.header-upper-icon div.header-wrap-icon div.header-action.header-action_account div.header-action_text a#site-account-handle.header-action__link.header-action-toggle span.box-icon svg.svg-ico-account g g#account-circle path";
//		String BTN_LOGO= "/html/body/div[2]/header/div[1]/div/div/div[2]/div/a/img";
		
		//System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//pop-up web browser
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		
		//actions	
		WebElement email_input= driver.findElement(By.xpath(TXT_EMAIL));
		email_input.clear();
		email_input.sendKeys(email);
		WebElement password_input= driver.findElement(By.xpath(TXT_PASSWORD));
		password_input.clear();
		password_input.sendKeys(password);
		WebElement login_click= driver.findElement(By.xpath(BTN_LOGIN));
		login_click.click();
		
		//assertion
		String exp_email= email;
		String act_email= driver.findElement(By.xpath(LBL_EMAIL)).getText();
		System.out.println(act_email);
		
		if (exp_email.equals(act_email)) {
			System.out.println("EMAIL IS ASSERTED SUCCESSFULLY!");
		}
		else {
			System.out.println("EMAIL IS ASSERTED UNSUCCESSFULLY!");
		}
		
		WebElement logout_click= driver.findElement(By.xpath(BTN_LOGOUT));
		logout_click.click();
		
		//driver.close();
		
	}

}
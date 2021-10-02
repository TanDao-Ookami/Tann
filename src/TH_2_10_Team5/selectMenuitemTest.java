package TH_2_10_Team5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMenuitemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/guru99home/";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        selectMenuItemTest("Agile Project", driver);
	}
	
	public static void selectMenuItemTest(String str, WebDriver dr) {
		WebElement listElement= dr.findElement(By.xpath("//ul[@class='nav navbar-nav']"));
		List<WebElement> childElements= listElement.findElements(By.xpath("//li[@class='dropdown']/child::a"));
		for (int i=0; i< childElements.size(); i++) {
			if (childElements.get(i).getText().equals(str)) {
				childElements.get(i).click();
				System.out.print("Pass");
				break;
			}
		}	
		//driver.close();
	}

}

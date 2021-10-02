package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class Checkbox {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "https://chandanachaitanya.github.io/";
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL+ "/selenium-practice-site/");
		driver.manage().window().maximize();
		
		WebElement bicycle = driver.findElement(By.xpath("//div[@id=\"twoWheelVehicles\"]//input[@id=\"bicycle-checkbox\"]"));
		
		bicycle.click();
		
		
//		long timeoutInSeconds = 0;
//		WebDriver webDriver = null;
//		WebDriverWait wait = new WebDriverWait(webDriver, timeoutInSeconds);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"twoWheelVehicles\"]//input[@id=\"bicycle-checkbox\"]")));
		
		if(bicycle.isSelected()) {
			System.out.println("Checkbox is Toggled On");
		}
		else {
			System.out.println("Checkbox is Toggled Off");
		}
		
		bicycle.click();
		
		if(!bicycle.isSelected()) {
			System.out.println("Checkbox is now Toggled Off !!");
		}
		
	}

}

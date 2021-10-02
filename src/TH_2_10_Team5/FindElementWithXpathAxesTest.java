package TH_2_10_Team5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWithXpathAxesTest {

	public static void parentXpath(WebDriver driver) {
        WebElement pX= driver.findElement(By.xpath("//div[@class=\"canvas-middle\"]//i//parent::a"));
        if (pX.isDisplayed()!=false) {
            System.out.println("Parent Xpath is found!");
        }
    }
    
    public static void childXpath(WebDriver driver) {
        WebElement cX= driver.findElement(By.xpath("//div[@class=\"canvas-middle\"]//a//child::i"));
        if (cX.isDisplayed()!=false) {
            System.out.println("Child Xpath is found!");
        }
    }
    
    public static void ancestorXpath(WebDriver driver) {
        WebElement aX= driver.findElement(By.xpath("//a//ancestor::div[@class=\"rt-block\"]//div[@class=\"canvas-graph\" and @style]"));
        if (aX.isDisplayed()!=false) {
            System.out.println("Ancestor Xpath is found!");
        }
    }
    
    public static void descendantXpath(WebDriver driver) {
        WebElement dX= driver.findElement(By.xpath("//div[@class=\"canvas-middle\"]//a[@href]//descendant::i"));
        if (dX.isDisplayed()!=false) {
            System.out.println("Descendant Xpath is found!");
        }
    }
    
    public static void precedeSiblingXpath(WebDriver driver) {
        WebElement pSX= driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]//ul//preceding-sibling::li//a"));
        if (pSX.isDisplayed()!=false) {
            System.out.println("Preceding Sibling Xpath is found!");
        }
    }
    
    public static void followingSiblingXpath(WebDriver driver) {
        WebElement fSX= driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]//ul//following-sibling::li//a[contains(text(),\"S\")]"));
        if (fSX.isDisplayed()!=false) {
            System.out.println("Following Sibling Xpath is found!");
        }
    }
    
    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/guru99home/";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
//        parentXpath(driver);
//        ancestorXpath(driver);
//        childXpath(driver);
//        descendantXpath(driver);
//        precedeSiblingXpath(driver);
//        followingSiblingXpath(driver);
        
    }
	

}
//div[@class="rt-block"]//preceding::h2[(contains(text(),"A few of our most popular courses"))]//following::i[@class='icon-wrench']//following::h4//a

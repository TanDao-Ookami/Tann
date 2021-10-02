package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://store.bobapop.com.vn";
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL+ "/dang-ky.html/");
		driver.manage().window().maximize();
		
		WebElement email_input= driver.findElement(By.xpath("//form[@id=\"dangnhapForm\"]//div//following::input[@name=\"maildangnhap\"]"));
		email_input.clear();
		email_input.sendKeys("daonguyenduytan1@gmail.com");
		
		WebElement password_input= driver.findElement(By.xpath("//input[@id=\"dnpassword\"]"));
		password_input.clear();
		password_input.sendKeys("213435356");
		
		WebElement bntpassword_input= driver.findElement(By.xpath("//input[@id=\"dangnhap\"]"));
		
		bntpassword_input.click();
		
		//div[@id="messageDialog"]//div//child::div[2]
	}

}

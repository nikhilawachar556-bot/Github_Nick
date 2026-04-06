package Test_one_Github;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys(" 53920");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessageVerify= driver.switchTo().alert().getText();
		System.out.println("Alert message is :"+ alertMessageVerify);
		alert.accept();
		
	

	}

}

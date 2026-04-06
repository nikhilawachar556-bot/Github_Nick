package Test_one_Github;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/");
        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        dateBox.sendKeys("05202022");
        dateBox.sendKeys(Keys.TAB);
        dateBox.sendKeys("0245PM");
        driver.findElement(By.xpath("/html/body/form/input[2]")).click();
        String VerifyDateTime= driver.findElement(By.xpath("/html/body/div[2]")).getText();

        System.out.println(VerifyDateTime);
        

	}

}

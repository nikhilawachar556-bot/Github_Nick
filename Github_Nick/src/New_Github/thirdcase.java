package New_Github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		//driver.findElement(By.id("fname"));
		//driver.findElement(By.id("fname")).click();
		driver.findElement(By.id("fname")).sendKeys("three");
        driver.findElement(By.id("fname")).clear();
        //driver.findElement(By.id("idOfButton"));
        driver.findElement(By.id("idOfButton")).click();
        //driver.findElement(By.id("male"));
        driver.findElement(By.id("male")).click();
       // driver.findElement(By.className("Automation"));
        driver.findElement(By.className("Automation")).click();
      //  driver.findElement(By.className("Performance"));
        driver.findElement(By.className("Performance")).click();
        //driver.close();
	}

}	
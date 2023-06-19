package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

public class AssertionsTypes{
    @Test
    public void TestGoogle() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        SoftAssert soft=new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
        String ExpectedURL="https://www.google.com";
        String actualURL=driver.getCurrentUrl();
        soft.assertEquals(ExpectedURL,actualURL);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Akash Poojary",Keys.ENTER);
        //System.out.println(driver.getCurrentUrl());
        String expectedTitle="Akash Poojary - Google Search";
        String actualTitle=driver.getTitle();
        soft.assertEquals(expectedTitle,actualTitle,"Title Mismtach");//Hard Assertion
        Thread.sleep(1000);
        //soft.assertAll();
        driver.quit();
        soft.assertAll();
    }
}

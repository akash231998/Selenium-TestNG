package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

        public class orageHRM {
        WebDriver driver;
        @BeforeTest
        public void BT(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        @Test
        public void ALaunchApp() throws InterruptedException {

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(5000);

        }

        @Test
        public void BEnterLoginDetails() throws InterruptedException {
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);
        }

        @Test
        public void CnavigateToMyInfo() throws InterruptedException {
            driver.findElement(By.xpath("//*[@href='/web/index.php/pim/viewMyDetails']")).click();
            Thread.sleep(5000);
            //driver.quit();

        }

        @AfterTest
            public void AT(){
            driver.quit();
        }

}

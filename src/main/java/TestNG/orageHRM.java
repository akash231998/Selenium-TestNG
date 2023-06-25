package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class orageHRM {
        WebDriver driver;
        @Parameters("browserName")
        @BeforeTest
        //public void BT(){
           //// WebDriverManager.chromedriver().setup();
            //driver=new ChromeDriver();
        //}
        public void InitialBrowser(String browserName){
            switch(browserName.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    System.err.println("Browser is Invalid");
                    break;
            }
            driver.manage().window().maximize();
        }

        @Parameters("url")
        @Test
        public void ALaunchApp(String url) throws InterruptedException {
            driver.get(url);
            //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(5000);

        }

        @Parameters({"username","password"})
        @Test
        public void BEnterLoginDetails(String username,String password) throws InterruptedException {
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);
        }

        @Parameters("sleep")
        @Test
        public void CnavigateToMyInfo(Long sleep) throws InterruptedException {
            driver.findElement(By.xpath("//*[@href='/web/index.php/pim/viewMyDetails']")).click();
            Thread.sleep(sleep);
            //driver.quit();

        }

        @AfterTest
            public void AT(){
            driver.quit();
        }

}

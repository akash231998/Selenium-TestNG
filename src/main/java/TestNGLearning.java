import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class TestNGLearning {
    @Test
    public void TestGoogle() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']"))
                .sendKeys("Akash Poojary",Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.quit();
    }

    @Test
    public void TestFacebook() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("Akash Poojary",Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.quit();
    }
}

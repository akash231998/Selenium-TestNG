//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SelAssertion {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void TC5_AssertNull() {


        //WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String actualUrl = driver.getTitle();
        String Expected="Rahul Shetty Academy - Login";
        Assert.assertEquals(actualUrl,Expected);
        //Assert.assertEquals(actualUrl, Expected);
        //softAssert.assertNull(actualUrl);
        //softAssert.assertNotNull(actualUrl);
        System.out.println("actualUrl :: " + actualUrl);

    }
}
